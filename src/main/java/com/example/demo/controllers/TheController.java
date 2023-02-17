package com.example.demo.controllers;


import com.example.demo.Models.Student;
import com.example.demo.Repo.StudentRepository;
import org.h2.engine.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class TheController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/index")
    public String main(Model model) {
        model.addAttribute("students", studentRepository.OrderByAttendance());
        return "index";
    }
    @PostMapping("/index")
    public String postMain(@Valid @ModelAttribute("students") Student student, BindingResult errors , Model model){

        if (errors.hasErrors()) {
            return "redirect:/index";
        }
            studentRepository.save(student);




        return "redirect:/index";
    }

/*    @Override
    public String getCreateSql(){

    }*/
}
