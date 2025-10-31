package com.dexterBlaze.website.service;

import com.dexterBlaze.website.domain.SupportUserMessage;
import com.dexterBlaze.website.domain.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMessageService implements MessageService{
    @Autowired
    UserMessage userMessage;

    @Override
    public String createMessage(int userId) {
        userMessage.setUserId(userId);
        //this is a generic useMessage and we will have to typecast it to use the getters and setter for accessing our message
        //instance variable
        SupportUserMessage supportUserMessage = (SupportUserMessage) userMessage;
        return supportUserMessage.getMessage();
    }
}
