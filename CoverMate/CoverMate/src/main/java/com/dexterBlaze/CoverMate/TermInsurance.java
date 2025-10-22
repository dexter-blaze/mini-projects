package com.dexterBlaze.CoverMate;

public class TermInsurance implements Insurance{
    public boolean isMarried;
    public boolean hasChildren;
    public boolean isSalaried;
    public double insurance = 5_000;

    public void setInsuranceDetails(boolean isMarried, boolean hasChildren, boolean isSalaried) {
        this.isMarried = isMarried;
        this.hasChildren = hasChildren;
        this.isSalaried = isSalaried;
    }

    public String getInsuranceName () {
        return this.getClass().getSimpleName();
    }

    public double getInsurancePremium() {
        if (this.isMarried == true || this.isSalaried == true) {
            this.insurance = 1.5 * this.insurance;
        }
        if (this.hasChildren = true) {
            this.insurance = 2 * this.insurance;
        }
        return this.insurance;
    }
}
