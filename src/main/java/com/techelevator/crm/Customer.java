package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {

<<<<<<< HEAD
    private String phoneNumber;
    private List<String> pets = new ArrayList<>();

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName) {
        new Customer(firstName, lastName, "");
    }

    public double getBalanceDue(Map<String, Double> balanceMap) {
        double totalBalanceDue = 0.00;

        for (String service : balanceMap.keySet()) {
            totalBalanceDue += balanceMap.get(service);
        }

        return totalBalanceDue;

    }

=======
    // ## INSTANCE VARIABLES ##

    private String phoneNumber;
    private List<String> pets = new ArrayList<>();

    // ## GETTERS AND SETTERS ##

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getPets() {
        return pets;
    }

    public void setPets(List<String> pets) {
        this.pets = pets;
    }

    // ## CONSTRUCTORS ##

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
        this.phoneNumber = "";
    }

    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double balanceDue = 0.0;
        for (String service : servicesRendered.keySet()) {
            balanceDue += servicesRendered.get(service);
        }
        return balanceDue;
    }
>>>>>>> 32d2e4efe0d558330fbcb8b0f7e855f501d2a9ad
}
