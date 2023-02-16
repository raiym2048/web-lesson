package com.example.demo.service;

import com.example.demo.Models.Student;
import com.example.demo.Repo.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServicelmpl implements StudentService{

    StudentRepository repository;

  /*  @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public void getAllStudent() {

    }*/




/*
    @Override
    public List<Student> getAllStudent() {
        return repository.findAll();
    }
*/

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student getById(int id) {
        return null;
    }

    @Override
    public Student sortByGpa() {
        return null;
    }

    /*@Override
    public Student sortByGpa() {
        return List<Student>;
    }*/
}
