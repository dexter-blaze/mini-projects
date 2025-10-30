package com.dexterBlaze.website.service;

import com.dexterBlaze.website.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserService {
    /* We write services in the interfaces of service layers
        User service has 2 functionalities :
       1. get the values of the attributes of the user

    */
    public User getUser();

    public boolean signUp(String name, String gender, String location, String college);
}
