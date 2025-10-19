package com.dexterBlaze.SocialMedia;
import java.util.ArrayList;

public class SimplePostList implements PostList{
    ArrayList<Post> postList;

    /** Creating an init method steps :
      1. Creating an init method in SimplePostList coz we want to prefill postList
      2. (How do we tell spring to do anything -> applicationContext.xml)
          We will tell spring  to run this method by mentioning it in .xml file
      3. Again we can see we don't need to make changes in our business logic
     **/
    public void init() {
        Post post = new SimplePost();
        post.setMessage("from DB"); //initialised the data of the postList
        postList.add(post);
    }

    //creating the destroy method:
    public void destroy () {
        System.out.println(this.getClass().getSimpleName() + " destroyed");
    }

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
