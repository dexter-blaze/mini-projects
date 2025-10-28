package com.dexterBlaze.CodingNinjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.quartz.QuartzDataSource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PaidCourse implements Course{
    String courseName;
    @Autowired
    UserList userList;
    Instructor courseInstructor;


    @Autowired
    @Qualifier("javaInstructor")
    Instructor javaInstructor;
    @Autowired
    @Qualifier("springInstructor")
    Instructor springInstructor;

    public void setInstructor(String instructorType) {
        if (instructorType.equals("java")) {
            this.courseInstructor = javaInstructor;
        } else if (instructorType.equals("spring")) {
            this.courseInstructor = springInstructor;
        }
    }

    public PaidCourse () {
//        this.courseInstructor = instructor;
//        this.userList = userList;
    }

    public void setCourseDetails(String courseName) {
        this.courseName = courseName;
    }
    public UserList getUserList() {
        return this.userList;
    }
    public Instructor getInstructor() {
        return this.courseInstructor;
    }
    public String getCourseName() {
        return this.courseName;
    }
}
