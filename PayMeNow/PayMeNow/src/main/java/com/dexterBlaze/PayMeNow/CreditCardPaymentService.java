package com.dexterBlaze.PayMeNow;

public class CreditCardPaymentService implements PaymentService{
    public double paymentAmount;
    public void processPayment() {
        System.out.println("Processing Credit Card payment of $" + this.paymentAmount);
    }

    public void setAmount (double paymentAmount){
            this.paymentAmount = paymentAmount;
    }
    public double getAmount () {
            return this.paymentAmount;
    }
}
