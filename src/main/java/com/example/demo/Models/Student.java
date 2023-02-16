package com.example.demo.Models;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String gpa;

    @Column
    private String groupa;

    @Column
    private String attendancea;

    public String getGroupa() {
        return groupa;
    }

    public void setGroupa(String group) {
        this.groupa = group;
    }

    public String getAttendancea() {
        return attendancea;
    }

    public void setAttendancea(String attendance) {
        this.attendancea = attendance;
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

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

}