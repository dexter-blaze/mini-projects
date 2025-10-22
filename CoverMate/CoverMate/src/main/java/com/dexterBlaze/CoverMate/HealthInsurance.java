package com.dexterBlaze.CoverMate;

public class HealthInsurance implements Insurance{
    public boolean isSmoker;
    public boolean isDrinker;
    public boolean previousConditions;
    private double  insurance = 10_000; // this is the base premium value

    /*
     a. Term Insurance:

        1. If salaried or married,  increase the premium
            by 1.5 times the base value.

        2. If hasChildren is true,  increase the premium
            by 2 times the base value.

    b. Health insurance:

        1. If  Smoker or Drinker, increase the premium
            by 1.5 times the base value.

        2. If the previous condition exists,  increase the
            premium by 2 times the base value.
     */
    public void setInsuranceDetails(boolean isSmoker, boolean isDrinker, boolean previousConditions) {
        this.isSmoker = isSmoker;
        this.isDrinker = isDrinker;
        this.previousConditions = previousConditions;
    }
    public String getInsuranceName () {
        return this.getClass().getSimpleName();
    }

    public double getInsurancePremium() {
        if (this.isSmoker == true || this.isDrinker == true) {
            this.insurance = 1.5 * this.insurance;
        }
        if (this.previousConditions = true) {
            this.insurance = 2 * this.insurance;
        }
        return this.insurance;
    }
}
