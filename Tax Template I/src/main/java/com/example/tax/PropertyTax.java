package com.example.tax;

public class PropertyTax implements Tax {
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

    public PropertyTax() {
        isTaxPayed = false;
    }

    @Override
    public void setTaxableAmount(int amount) {
        this.taxableAmount = amount;
    }

    @Override
    public void calculateTaxAmount() {
        double taxRate = 5;
        taxAmount = (taxRate * taxableAmount) / 100;
    }

    @Override
    public double getTaxAmount() {
        return this.taxAmount;
    }

    @Override
    public String getTaxType() {
        return "property";
    }

    @Override
    public boolean isTaxPayed() {
        return this.isTaxPayed;
    }

    @Override
    public void payTax() {
        System.out.println("Hi, your property tax is paid.");
        this.isTaxPayed = true;
    }
}
