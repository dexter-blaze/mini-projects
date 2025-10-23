package com.dexterBlaze.CodingNinjas;

import org.springframework.stereotype.Component;

@Component("springInstructor")
public class SpringInstructor implements Instructor{
    public String name;
    public String age;

    //init() and destroy() method
    public void init() {
        System.out.println(this.getClass().getSimpleName() +" created.");
    }

    public void cleanup() {
        System.out.println(this.getClass().getSimpleName() +" destroyed.");
    }

    public void setInstructorDetails(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public void takeClass() {
        System.out.println("Hi my name is " + this.name + ", and i'll be your spring instructor");
    }
}
