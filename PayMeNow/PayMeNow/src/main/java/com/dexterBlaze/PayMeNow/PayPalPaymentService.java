package com.dexterBlaze.PayMeNow;

public class PayPalPaymentService implements PaymentService{

    public double paymentAmount;
    public void processPayment() {
        System.out.println("Processing PayPal payment of $" + this.paymentAmount);
    }

    public void setAmount (double paymentAmount){
        this.paymentAmount = paymentAmount;
    }
    public double getAmount () {
        return this.paymentAmount;
    }
}
