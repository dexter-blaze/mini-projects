package com.dexterBlaze.CodingNinjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaidCourse implements Course{
    String courseName;
    @Autowired
            @Qualifier("javaInstructor")
    Instructor courseInstructor;
    @Autowired
    UserList userList;

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
