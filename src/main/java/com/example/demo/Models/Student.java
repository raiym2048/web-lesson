package com.example.demo.Models;

import jakarta.persistence.*;

import javax.validation.constraints.NotNull;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @NotNull(message = "User's name cannot be null.")
    @Column
    private String name;

    @NotNull(message = "User's name cannot be null.")
    @Column
    private int gpa;

    @NotNull(message = "User's name cannot be null.")
    @Column
    private  String group;

    @NotNull(message = "User's name cannot be null.")
    @Column
    private String attendance;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

}