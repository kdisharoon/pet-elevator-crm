package com.techelevator;

import java.util.Map;

public abstract interface Billable {

    double getBalanceDue(Map<String, Double> servicesRendered);

}
