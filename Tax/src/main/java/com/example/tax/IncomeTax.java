package com.example.tax;

public class IncomeTax implements Tax {
    double taxAmount;
    double taxableAmount;
    boolean isTaxPayed;

    public IncomeTax() {
        isTaxPayed = false;
    }

    @Override
    public void setTaxableAmount(int amount) {
        taxableAmount = amount;
    }

    @Override
    public void calculateTaxAmount() {
        if(taxableAmount <= 300000){
            taxAmount = 0;
        } else if (taxableAmount <= 6_00_000) {
            taxAmount = 0.05 * taxableAmount;
        } else if (taxableAmount <= 9_00_000) {
            taxAmount = 0.1 * taxableAmount;
        } else if (taxableAmount <= 12_00_000) {
            taxAmount = 0.15 * taxableAmount;
        } else if (taxableAmount <= 15_00_000) {
            taxAmount = 0.2 * taxableAmount;
        }
        else{
            taxAmount = 0.3 * taxableAmount;
        }
    }

    @Override
    public double getTaxAmount() {
        return taxAmount;
    }

    @Override
    public String getTaxType() {
        return "income";
    }

    @Override
    public boolean isTaxPayed() {
        return isTaxPayed;
    }

    @Override
    public void payTax() {
        System.out.println("Hi, your income tax is paid");
        isTaxPayed = true;
    }
}
