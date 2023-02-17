package com.example.demo.Repo;

import com.example.demo.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
/*
    List<Student> getStudentsByGpa();
*/
/*
List<Student> findAllByPrice(double gpa, Pageable pageable);
*/
    List<Student> findByGpaGreaterThanOrderByGpaDesc(String gpa);
   /* List<Student> findByNameLike(String name);*/
    //List<Student> findByAttendanceLike(String attendance);

}