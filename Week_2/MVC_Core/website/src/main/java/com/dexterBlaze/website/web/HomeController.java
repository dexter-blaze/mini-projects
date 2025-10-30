package com.dexterBlaze.website.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    // if a request comes from 8086/home it should actually return something
    //so we are mapping the request to the function
    @RequestMapping("/home")
    public String getHomePage() {
        return "home";
    }
}
