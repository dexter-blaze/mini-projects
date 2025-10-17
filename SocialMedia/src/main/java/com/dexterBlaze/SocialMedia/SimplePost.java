package com.dexterBlaze.SocialMedia;

public class SimplePost implements Post{
    private String message;

    public void setMessage (String message) {
        this.message = message;
    }

    public String getMessage () {
        return this.message;
    }
}
