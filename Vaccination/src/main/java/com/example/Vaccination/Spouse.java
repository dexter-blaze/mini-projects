package com.example.Vaccination;

/**
  This class is an implementation of a User Interface based on the selection 
  in the console the user type is selected.You need to complete this class 
  based on the following tasks.
    
   Tasks:
 a.Override the methods of User Interface.
 b.Adding common attributes:
    1. String name
    2. Integer age
    3. boolean isVaccinated
    4. TimeAndLocation(class), vaccine(interface), both are injected by the constructor method.
    5. The arguments of the constructor for all users should be like "public User(TimeAndLocation timeAndLocation, Vaccine vaccine)"
 c.Build the logic for all the methods based on the description mentioned in the User Interface.
 
**/
public class Spouse implements User {
    private String name;
    private Integer age;
    public boolean isVaccinated;
    public TimeAndLocation timeAndLocation;
    public Vaccine vaccine;

    public Spouse(TimeAndLocation timeAndLocation, Vaccine vaccine) {
        this.timeAndLocation = timeAndLocation;
        this.vaccine = vaccine;
    }

    @Override
    public Vaccine getVaccineDetails () {
        return this.vaccine;
    }

    @Override
    public void setUserDetails(String name, int age, TimeAndLocation timeAndLocation) {
        this.name = name;
        this.age = age;
        this.timeAndLocation = timeAndLocation;
    }

    @Override
    public void setAppointment () {
        //Hello John your appointment has been fixed for Covid Vaccine on  12 Pm at Mumbai  on 2023-05-10"
        this.isVaccinated = true;
        System.out.println("Hello " + this.name + " your appointment has been fixed for " + vaccine.getType()
                + " Vaccine on " + this.timeAndLocation.getDetails() );
    }

    @Override
    public boolean IsVaccinated() {
        return this.isVaccinated;
    }
}
