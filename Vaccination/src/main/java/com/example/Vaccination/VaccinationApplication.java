package com.example.Vaccination;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;
import java.util.Scanner;

@SpringBootApplication
public class VaccinationApplication {

    public static void main(String[] args) {

        /*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

		 Tasks:
		1. Fetch context from ApplicationContext.xml and initiate Scanner.
		2. Fetch vaccine and User type choice.
		3. Get the required bean from context.
		4. Get the appointment details form user
		5. Display the appointment details
		6. Run the loop again to book for another user or else exit.
		 */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the Vaccination Application");
            System.out.println("Please choose your vaccine preference:\n1. Covid\n2. Polio\n3. Typhoid");
            int vaccineChoice = scanner.nextInt();
            System.out.println("Whom do you want to vaccinate:" +
                    "\n1. Father\n2. Mother\n3. Self\n4. Spouse\n5. Exit");
            int userChoice = scanner.nextInt();
            scanner.nextLine(); //------
            String finalChoice="";
            
            switch(vaccineChoice) {
                case 1 -> {
                    switch(userChoice) {
                        case 1 -> {
                            finalChoice = "fatherCovid";
                        }
                        case 2 -> {
                            finalChoice = "motherCovid";
                        }
                        case 3 -> {
                            finalChoice = "selfCovid";
                        }
                        case 4 -> {
                            finalChoice = "spouseCovid";
                        }
                        case 5 -> {
                            System.out.println("Exiting...");
                            return;
                        }
                        default -> {
                            System.out.println("Invalid Choice");
                            return;
                        }
                    }
                }
                case 2 -> {
                    switch(userChoice) {
                        case 1 -> {
                            finalChoice = "fatherPolio";
                        }
                        case 2 -> {
                            finalChoice = "motherPolio";
                        }
                        case 3 -> {
                            finalChoice = "selfPolio";
                        }
                        case 4 -> {
                            finalChoice = "spousePolio";
                        }
                        case 5 -> {
                            System.out.println("Exiting...");
                            return;
                        }
                        default -> {
                            System.out.println("Invalid Choice");
                            return;
                        }
                    }
                    
                }
                case 3 -> {
                    switch(userChoice) {
                        case 1 -> {
                            finalChoice = "fatherTyphoid";
                        }
                        case 2 -> {
                            finalChoice = "motherTyphoid";
                        }
                        case 3 -> {
                            finalChoice = "selfTyphoid";
                        }
                        case 4 -> {
                            finalChoice = "spouseTyphoid";
                        }
                        case 5 -> {
                            System.out.println("Exiting...");
                            return;
                        }
                        default -> {
                            System.out.println("Invalid Choice");
                            return;
                        }
                    }
                }
                default -> {
                    System.out.println("Invalid choice");
                    return;
                }
            }
            User user = (User) context.getBean(finalChoice);

            if (user.IsVaccinated()) {
                System.out.println(user.getClass().getSimpleName() + " is already vaccinated");
                System.out.println("Do you want to book appointment for someone else:\n1. Yes\n2. No");
                int choice1 = scanner.nextInt();

                switch (choice1) {
                    case 1 -> {
                        continue;
                    }
                    case 2 -> {
                        return;
                    }
                    default -> {
                        System.out.println("Invalid choice");
                        return;
                    }
                }
            } else {
                System.out.println("Please enter " + user.getClass().getSimpleName() + " details:");
                System.out.print("Name:");
                String name = scanner.nextLine();
//                System.out.println();

                System.out.print("Age:");
                int age = scanner.nextInt();
                scanner.nextLine(); //-----
//                System.out.println();

                System.out.print("Appointment Date (YYYY-MM-DD):");
                String date = scanner.nextLine();
//                System.out.println();

                System.out.print("Appointment Date (HH:MM AM/PM):");
                String timeSlot = scanner.nextLine();
//                System.out.println();

                System.out.print("Appointment Location:");
                String location = scanner.nextLine();
//                System.out.println();

                TimeAndLocation tAndLoc = (TimeAndLocation) context.getBean("timeAndLocation");
                tAndLoc.setDetails(timeSlot, location, date);

                user.setUserDetails(name, age, tAndLoc);
                user.setAppointment();

                System.out.println("Do you want to register for someone else:\n1. Yes\n2. No");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> {
                        continue;
                    }
                    case 2 -> {
                        return;
                    }
                    default -> {
                        return;
                    }
                }
            }
        }
    }
}
