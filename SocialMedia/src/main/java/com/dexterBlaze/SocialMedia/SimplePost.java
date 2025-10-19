package com.dexterBlaze.SocialMedia;

public class SimplePost implements Post{
    private String message;

    public void init() {
        System.out.println(this.getClass().getSimpleName());
    }

    //creating the destroy method:
    public void destroy () {
        System.out.println(this.getClass().getSimpleName() + " destroyed");
    }

    public void setMessage (String message) {
        this.message = message;
    }

    public String getMessage () {
        return this.message;
    }
}
