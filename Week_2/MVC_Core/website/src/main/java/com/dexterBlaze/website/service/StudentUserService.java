package com.dexterBlaze.website.service;

import com.dexterBlaze.website.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentUserService implements UserService{
    //this will be automatically filled with the studentUser object as it is DI'd
    @Autowired
    User studentUser;

    @Override
    public User getUser() {
        return studentUser; //returns the empty studentUser object
    }

    //we'd want to create a user domain object with all its attribute values and save that object
    @Override
    public int signUp(String name, String gender, String location, String college) {
        boolean isStudentCreated = studentUser.createUser(name, gender, location, college);
        if(isStudentCreated) {
            return studentUser.saveUser();
        } else {
            return -1;
        }
//        return isStudentCreated;
    }
}
