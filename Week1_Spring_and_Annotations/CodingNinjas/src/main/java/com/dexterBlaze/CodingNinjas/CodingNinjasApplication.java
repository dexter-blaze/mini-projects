package com.dexterBlaze.CodingNinjas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//@SpringBootApplication
public class CodingNinjasApplication {

	public static void main(String[] args) {
        /* Passing the entire package as annotations are being given on the classes of this package, and spring should look
        for the annotation in the entire package
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "com.dexterBlaze.CodingNinjas");
        Scanner scanner = new Scanner(System.in);
        //get the user (prototype bean) and set the user details
        //in annotation we give class name instead of id as there is no id and also we don't need to typecast it
        User user = context.getBean(SimpleUser.class);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please enter your age");
        String age = scanner.nextLine();
        System.out.println("Please enter your college");
        String college = scanner.nextLine();
        System.out.println("Please enter your location");
        String location = scanner.nextLine();

        Instructor javaInstructor = context.getBean(JavaInstructor.class);
        javaInstructor.setInstructorDetails("abhee", "21");
        javaInstructor.takeClass();
//		SpringApplication.run(CodingNinjasApplication.class, args);
//        System.out.println("Welcome to Coding Ninjas application");
//        // getting context from xml
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        // configure the courses and create a list of course offered
//        ArrayList<PaidCourse> paidCourse = new ArrayList<>();
//        PaidCourse javaCourse = (PaidCourse) context.getBean("javaCourse");
//        PaidCourse springCourse = (PaidCourse) context.getBean("springCourse");
//
//        // set java course instructor details and course name
//        javaCourse.courseInstructor.setInstructorDetails("Abhee", "25");
//        javaCourse.setCourseDetails("Basics of JAVA");
//
//        // set spring course instructor details and course name
//        springCourse.courseInstructor.setInstructorDetails("TimTim", "24");
//        javaCourse.setCourseDetails("Spring and SpringBoot");
//
//        //add the java course and spring course to the list of courses offered
//        paidCourse.add(javaCourse);
//        paidCourse.add(springCourse);
//
//        Scanner scanner = new Scanner(System.in);
//
//
//        while (true) {
//            System.out.println("Please select from the following :" + "\n1. Register a new user\n2. See course information"
//            + "\n3. Quit");
//            int option = scanner.nextInt();
//
//            //flush the scanner
//            scanner.nextLine();
//
//            switch(option) {
//                case 1 -> {
//                    //get the user (prototype bean) and set the user details
//                    User user = (User) context.getBean("simpleUser");
//                    System.out.println("Please enter your name");
//                    String name = scanner.nextLine();
//                    System.out.println("Please enter your age");
//                    String age = scanner.nextLine();
//                    System.out.println("Please enter your college");
//                    String college = scanner.nextLine();
//                    System.out.println("Please enter your location");
//                    String location = scanner.nextLine();
//
//                    user.setUserDetails(name, age, location, college);
//                    // select the course from the list of paid course we have configured
//                    int index = 0;
//                    System.out.println("Please select a course");
//                    for(Course course : paidCourse) {
//                        System.out.println(index + "." + course.getCourseName());
//                        index++;
//                    }
//                    int courseId = scanner.nextInt();
//                    if (courseId >= paidCourse.size()) {
//                        System.out.println("Not a valid course");
//                        break;
//                    }
//                    PaidCourse selectedCourse = paidCourse.get(courseId);
//                    //add user to the list of the course
//                    selectedCourse.userList.addUser(user);
//                    break;
//                }
//                case 2 -> {
//                    for (Course course : paidCourse) {
//                        System.out.println(course.getCourseName());
//                        if (course.getUserList().getUserList().size()>0) {
//                            System.out.println("The students in the course: ");
//                            int index = 1;
//                            // display all the students who have enrolled
//                            for (User user : course.getUserList().getUserList()) {
//                                System.out.println(index + ". " + user.getUserDetails());
//                                index++;
//                            }
//                        } else {
//                            System.out.println("No students registered for this course");
//                        }
//                        break;
//                    }
//                }
//                case 3 -> {
//                    break;
//                }
//                default -> {
//                    throw new IllegalArgumentException("Unexpected value: " + option);
//                }
//            }
//            if (option == 3) {
//                break;
//            }
//        }
//        System.out.println("Program stopped!");
//        context.close();
//        scanner.close();
	}
}
