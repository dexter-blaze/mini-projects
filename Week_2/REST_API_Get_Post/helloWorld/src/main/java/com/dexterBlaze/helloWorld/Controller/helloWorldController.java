package com.dexterBlaze.helloWorld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//this controller is used to tell springboot that this is the class that is enabled for the rest api's
@RestController
@RequestMapping("/project")
public class helloWorldController {

    //this annotation tell that i am exposing this api(inside request mapping we are giving name of the api)
    @RequestMapping("/hello")
    public String helloWorld() {
        return "Congracts! for building your first api...";
    }

    @GetMapping("hello-earth")
    public String helloEarth() {
        return "Hi earth! You got a new coder...";
    }
}
