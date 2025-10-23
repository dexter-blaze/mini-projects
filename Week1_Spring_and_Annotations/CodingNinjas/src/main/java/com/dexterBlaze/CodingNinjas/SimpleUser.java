package com.dexterBlaze.CodingNinjas;

public class SimpleUser implements User{
    public String name;
    public String age;
    public String location;
    public String collegeName;

    @Override
    public void setUserDetails(String name, String age, String location, String collegeName) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.collegeName = collegeName;
    }
    
    @Override
    public String getUserDetails () {
        return this.name + " age: " + this.age;
    }
}
