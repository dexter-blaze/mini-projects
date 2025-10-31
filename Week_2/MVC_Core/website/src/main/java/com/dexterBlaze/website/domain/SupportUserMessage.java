package com.dexterBlaze.website.domain;

import org.springframework.stereotype.Component;

@Component
public class SupportUserMessage implements UserMessage{
    public String message;
    @Override
    public void setUserId(int userId) {
        //String.valueOf() takes number and convert it to string
        this.message = "Hi, Welcome to support " + String.valueOf(userId);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
