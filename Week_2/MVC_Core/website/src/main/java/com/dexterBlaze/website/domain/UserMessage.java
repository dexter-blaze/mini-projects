package com.dexterBlaze.website.domain;

import org.springframework.stereotype.Component;

public interface UserMessage {
    //we are passing the unique ID we got from the query parameter (value part of key, value pair)
    void setUserId(int userId);

}
