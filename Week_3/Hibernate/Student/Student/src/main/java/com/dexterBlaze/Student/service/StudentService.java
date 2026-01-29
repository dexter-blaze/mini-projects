package com.dexterBlaze.Student.service;

import com.dexterBlaze.Student.dal.StudentDAL;
import com.dexterBlaze.Student.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;

@Service
public class StudentService {
    @Autowired
    StudentDAL studentDAL;

    @Transactional //tells hibernate that a transaction is starting here
    public void save(Student student) {
        studentDAL.save(student);
    }
}
