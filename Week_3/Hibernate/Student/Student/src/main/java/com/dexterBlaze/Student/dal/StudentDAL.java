package com.dexterBlaze.Student.dal;

import com.dexterBlaze.Student.entity.Student;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //tells it's a db associated class
public class StudentDAL {
    @Autowired
    EntityManager entityManager;

    public void save(Student student) {
        //get the session object
        Session session = entityManager.unwrap(Session.class); //unwrapping and returning a session object
        session.persist(student); //alternate of session.save()
    }
}
