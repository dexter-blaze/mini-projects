package com.dexterBlaze.website.service;

import com.dexterBlaze.website.domain.StudentUser;
import com.dexterBlaze.website.repository.StudentUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserCheckService implements CheckService{
    @Autowired
    StudentUserDAO studentUserDAO;

    @Override
    public String checkUser(Integer id) {
         Optional<StudentUser> student = studentUserDAO.get(id);
         if (student.isPresent()) {
             return student.get().getName();
         }
         return "Anonymous";
    }
}
