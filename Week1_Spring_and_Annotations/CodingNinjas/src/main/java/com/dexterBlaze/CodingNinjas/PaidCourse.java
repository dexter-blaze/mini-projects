package com.dexterBlaze.CodingNinjas;

public class PaidCourse implements Course{
    String courseName;
    Instructor courseInstructor;
    UserList userList;

    public PaidCourse (Instructor instructor, UserList userList) {
        this.courseInstructor = instructor;
        this.userList = userList;
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
