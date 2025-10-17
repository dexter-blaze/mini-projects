package com.dexterBlaze.SocialMedia;
import java.util.ArrayList;

public class SimplePostList implements PostList{
    ArrayList<Post> postList;

    public SimplePostList () {
        /* this is initializing and obviously
        your initialize int constructor. */
        this.postList = new ArrayList<>();
    }

    public ArrayList<Post> getAllPost () {
        return this.postList;
    }

    public void setPost (Post post) {
        this.postList.add(post);
    }

    public Post getPost (int i) {
        return postList.get(i);
    }

    public int size () {
        return postList.size();
    }
}
