package com.dexterBlaze.Student.entity;

import jakarta.persistence.*;
//this class is a pojo but also a db mapping, so call it Student entity
//student class is the mapping of a table in the db
@Entity // to mark the class as hibernate entity
@Table(name = "student")
public class Student {

    @Id //to set primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //automatically generate unique id for this field
    @Column //to tell it's a column
    private int id;
    @Column
    private String name;
    @Column
    private String standard;

    public Student(String name, String standard) {
        this.name = name;
        this.standard = standard;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
