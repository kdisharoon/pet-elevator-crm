package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {

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

}
