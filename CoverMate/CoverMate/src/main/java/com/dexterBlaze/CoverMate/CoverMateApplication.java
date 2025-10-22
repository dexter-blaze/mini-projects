package com.dexterBlaze.CoverMate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class CoverMateApplication {
	public static void main(String[] args) {
//		SpringApplication.run(CoverMateApplication.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //creating input class
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Welcome to Insurance Application");
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("Which Insurance do you want?" + "\nSelect 1 or 2 from Below Option" +
                "1 - Health Insurance \n2 - Term Insurance");
        int insuranceChoice = scanner.nextInt();
        String insurance = "";

        switch (insuranceChoice) {
            case 1 -> {
                insurance = "Health";
            }
            case 2 -> {
                insurance = "Term";
            }
            default -> {
                System.out.println("Invalid choice");
                return;
            }
        }
        Insurance insurance = (Insurance) context.getBean(vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv);
        user.setUserDetails(name, age);

        System.out.println("Are you a drinker?");
        char c1 = scanner.next();



	}
}
