package com.dexterBlaze.PayMeNow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class PayMeNowApplication {

	public static void main(String[] args) {
//		SpringApplication.run(PayMeNowApplication.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter your payment amount:");
        double amount = scanner.nextDouble();

        System.out.println("Enter payment mode(CreditCard, PayPal or BankTransfer)");
        String choice = scanner.next();
        PaymentService paymentService;

        if (choice.equals("CreditCard")) {
            paymentService = (PaymentService) context.getBean("creditCardPaymentService");
        } else if ( choice.equals("PayPal")) {
            paymentService = (PaymentService) context.getBean("payPalPaymentService");
        } else if (choice.equals("BankTransfer")) {
            paymentService = (PaymentService) context.getBean("bankTransferPaymentService");
        } else {
            System.out.println("Invalid Choice");
            return;
        }

        paymentService.setAmount(amount);
        paymentService.processPayment();
	}
}
