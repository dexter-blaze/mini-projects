package com.dexterBlaze.SocialMedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class SocialMediaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialMediaApplication.class, args);
        //get the context from xml file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Post post  = (Post) context.getBean("simplePost");
        //prompt the user that app has started
        System.out.println("Social Media App! Started...");

        //setup scanner - to take user input
        Scanner scanner = new Scanner(System.in);

        /* if you think about a social media website/app you can keep looking/posting the posts until you decide
        to close the application - replicate this behaviour using infinite loop ( while more efficient than for ) */
        while(true) {
            //fetch a postList
            PostList postList = (PostList) context.getBean("simplePostList");

            //prompting to user for different selection
            System.out.println("1. Make new post\n2. Show all post\n3. Exit");
            int menuItem = scanner.nextInt();

            //using switch cases, and we want a new post -> spring will return us the instance of a post
            switch(menuItem) {
                case 1 -> {
                    Post post = (Post) context.getBean("simplePost"); //should be singleton as in one session we need only one postList
                    System.out.println("Write your post:");
                    scanner.nextLine(); //used nextInt() above so to flush the \n and moving to the next line
                    post.setMessage(scanner.nextLine());
                    /* right now we don't have the post list to store our post so should we create it everytime we
                       write the post or should we create it in the start of the loop ? -> start because even if it's
                       case 2 we will be able to fetch the post from it
                     */
                    postList.setPost(post); //adding post to the postList

                }
                case 2 -> {
                    System.out.println("All the posts by user:");
                    //rendering the posts
                    for (int i = 0; i< postList.size(); i++){
                        System.out.println(i + ". " + postList.getPost(i).getMessage());
                    }
                    return;
                }
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> {
                    System.out.println("Invalid choice");
                    return;
                }
            }
        }
	}
}
