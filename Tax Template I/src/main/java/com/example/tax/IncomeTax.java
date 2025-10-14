package com.example.tax;

public class IncomeTax implements Tax{
    /*
    1. Create the following attributes.
        a. taxableAmount (double)
        b. taxAmount (double)
        c. isTaxPayed (boolean)
    2. Make this class an implementation of Tax interface and override the interface methods.
    3. Using constructor initialize the isTaxPayed boolean false.
     */
    double taxableAmount;
    double taxAmount;
    boolean isTaxPayed;

    @Override
    public void setTaxableAmount(int amount) {
        this.taxableAmount = amount;
    }

    @Override
    public void calculateTaxAmount() {
        double taxRate = 0;
        if (taxableAmount <= 3_00_000) {
            taxRate = 0;
        } else if (taxableAmount > 3_00_000 && taxableAmount<= 6_00_000) {
            taxRate = 5;
        } else if (taxableAmount > 6_00_000 && taxableAmount<= 9_00_000){
            taxRate = 10;
        } else if (taxableAmount > 9_00_000 && taxableAmount<= 12_00_000) {
            taxRate = 15;
        } else if (taxableAmount > 12_00_000 && taxableAmount<= 15_00_000) {
            taxRate = 20;
        } else {
            taxRate = 30;
        }

        this.taxAmount = (taxRate * taxableAmount) / 100;
    }

    @Override
    public double getTaxAmount() {
        return this.taxAmount;
    }

    @Override
    public String getTaxType() {
        return "income";
    }

    @Override
    public boolean isTaxPayed() {
        return this.isTaxPayed;
    }

    @Override
    public void payTax() {
        System.out.println("Hi, your income tax is paid.");
        this.isTaxPayed = true;
    }
}
