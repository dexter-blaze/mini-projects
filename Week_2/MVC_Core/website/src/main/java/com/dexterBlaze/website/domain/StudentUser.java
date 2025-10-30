package com.dexterBlaze.website.domain;

import com.dexterBlaze.website.repository.StudentUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentUser implements User {
    @Autowired
    StudentUserDAO studentUserDAO;
    //all the characteristics a user will have
    public String name;
    public String gender;
    public String location;
    public String college;
    public int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public boolean createUser(String name, String gender, String location, String college) {
        this.name = name;
        this.gender = gender;
        this.location = location;
        this.college = college;
        return true; // as of now since we are not using check right now
    }

    @Override
    public Integer saveUser() {
        System.out.println(this.name);
        return studentUserDAO.save(this); // since we haven't decided where to save
    }
}
