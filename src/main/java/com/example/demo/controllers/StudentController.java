package com.example.demo.controllers;


import com.example.demo.Models.Student;
import com.example.demo.Repo.StudentRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    List<Student> getAllStudents(){
        return(List<Student>) studentRepository.findAll();
    }
    @GetMapping("/students/{id}")
    Student getOneStudentById(@PathVariable Long id){return studentRepository.findById(id).orElseThrow();}

    @PostMapping("/students")
    Student addStudent(@RequestBody Student student){
        studentRepository.save(student);
        return student;
    }

    @DeleteMapping("students/{id}")
    void deleteStudentById(@PathVariable Long id){
        try {
            studentRepository.deleteById(id);
        }
        catch (EmptyResultDataAccessException e){
            System.out.println(e+" no such id");
        }
    }

    @PutMapping("students/{id}")
    Student updateStudent(@RequestBody Student newStudent, @PathVariable Long id){
        return studentRepository.findById(id).map(
                student -> {
                    student.setName(newStudent.getName());
                    student.setAttendance(newStudent.getAttendance());
                    student.setGpa(newStudent.getGpa());
                    student.setGroup(newStudent.getGroup());
                    return studentRepository.save(student);
                }
        ).orElseGet(() ->{
            newStudent.setId(id);
            return studentRepository.save(newStudent);
        });
    }
}
/*[{
"name":"12",
"attendance":"22",
"gpa":"33",
"group":"44"
}]*/
