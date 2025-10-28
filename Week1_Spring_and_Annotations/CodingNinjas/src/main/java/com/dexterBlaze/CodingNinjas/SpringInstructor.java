package com.dexterBlaze.CodingNinjas;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("springInstructor")
public class SpringInstructor implements Instructor{
    public String name;
    public String age;

    //init() and destroy() method
    @PostConstruct
    public void init() {
        System.out.println(this.getClass().getSimpleName() +" created.");
    }

    @PreDestroy
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
