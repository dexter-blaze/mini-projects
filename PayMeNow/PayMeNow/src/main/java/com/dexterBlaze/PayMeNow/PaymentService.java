package com.dexterBlaze.PayMeNow;

public interface PaymentService {
    void processPayment();
    void setAmount(double paymentAmount);
    double getAmount();
}
