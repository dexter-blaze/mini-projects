package com.dexterBlaze.CoverMate;

public class Customer implements User{
    public String name;
    public int age;
    Insurance insurance;

    public void setUserDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void getInfo() {
        System.out.println("Hi " + this.name + ", you have a " + insurance.getInsuranceName() + " of Rs." +
                insurance.getInsurancePremium());
    }
}
