package com.example.demo.controllers;


import com.example.demo.Models.Student;
import com.example.demo.Repo.StudentRepository;
import org.h2.engine.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }
    @PostMapping("/index")
    public String postMain(Model model){



        return "redirect:/index";
    }

/*    @Override
    public String getCreateSql(){

    }*/
}
