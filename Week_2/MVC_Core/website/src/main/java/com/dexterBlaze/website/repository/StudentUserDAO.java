package com.dexterBlaze.website.repository;

import com.dexterBlaze.website.domain.StudentUser;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@Scope("singleton")
public class StudentUserDAO implements DAO<StudentUser> {
    //created a list to store student user, right now we are not connecting to DB
    List<StudentUser> studentUserList = new ArrayList<>();

    @Override
    public Optional<StudentUser> get(Integer id) {
        if(!studentUserList.isEmpty()) {
            return Optional.of(studentUserList.get(id));
        }
        return Optional.empty();
    }

    @Override
    public int save(StudentUser student) {
        int userId = studentUserList.size();
        student.setUserId(userId);
        studentUserList.add(student);
        System.out.println("Student saved! " + userId );
        return userId;
    }
}
