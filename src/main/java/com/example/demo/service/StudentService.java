package com.example.demo.service;

import com.example.demo.Models.Student;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface StudentService {
/*
    List<Student> getAllStudents();
*/

/*
    void getAllStudent();*/

    Student saveStudent(Student student);

    Student getById(int id);
    Student sortByGpa();
}
