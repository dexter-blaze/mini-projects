package com.dexterBlaze.PayMeNow;

public class BankTransferPaymentService implements PaymentService{

    public double paymentAmount;
    public void processPayment() {
        System.out.println("Processing Bank Transfer of $" + this.paymentAmount);
    }

    public void setAmount (double paymentAmount){
        this.paymentAmount = paymentAmount;
    }
    public double getAmount () {
        return this.paymentAmount;
    }

}
