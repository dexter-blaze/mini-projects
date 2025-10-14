package com.example.tax;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class TaxApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Tax Payment Application");
		while (true) {
            System.out.println("Please select which tax you want to pay: \n1. Income \n2. Property\n3. Exit");
            int userChoice = scanner.nextInt();
            String taxChoice = "";
            switch (userChoice) {
                case 1 -> taxChoice = "incomeTax";
                case 2 -> taxChoice = "propertyTax";
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> {
                    System.out.println("Invalid choice");
                    return;
                }
            }
            Tax tax = (Tax) context.getBean(taxChoice);
            if (tax.isTaxPayed()) {
                System.out.println("Hi, your " + tax.getTaxType() + " is paid");
            } else {
                System.out.println("Please enter your " + tax.getTaxType() + " value :");
                int amount = scanner.nextInt();
                tax.setTaxableAmount(amount);
                tax.calculateTaxAmount();
                System.out.println("You have selected " + tax.getTaxType() + " and your tax amount is : " + tax.getTaxAmount());
                System.out.println("Do you want to pay the tax? \n1. Yes\n2. Exit");
                int response = scanner.nextInt();
                if (response == 1) {
                    tax.payTax();
                } else {
                    return;
                }
            }
        }
    }
}
