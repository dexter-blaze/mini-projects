package com.dexterBlaze.SocialMedia;


public class SimpleUser implements User{
    public String userName;
    //dependency
    public PostList postList; //instance variable to store our post list.

    //setter method DI
    @Override
    public void setPostList(PostList postList) {
        this.postList = postList;
    }

    public PostList getPostList () {
        return this.postList;
    }

    public void setUserName (String userName) {
        this.userName = userName;
    }

    public String getUserName () {
        return this.userName;
    }
}