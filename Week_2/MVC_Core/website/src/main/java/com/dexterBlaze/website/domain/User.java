package com.dexterBlaze.website.domain;

public interface User {
    boolean createUser(String name, String gender, String location, String college);
    //returns a unique user id when the user details are saved
    Integer saveUser();
}
