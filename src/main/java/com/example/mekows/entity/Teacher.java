package com.example.mekows.entity;

import javax.persistence.*;

@Entity
@Table(name="teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String teaName;
    private Integer teaAge;

    public Teacher(String teaName, Integer teaAge) {
        super();
        this.teaName = teaName;
        this.teaAge = teaAge;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public Integer getTeaAge() {
        return teaAge;
    }

    public void setTeaAge(Integer teaAge) {
        this.teaAge = teaAge;
    }
}