package com.techelevator.hr;

import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class EmployeeTests {

    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee employee = new Employee("Test", "Testerson");
        String fullName = employee.getFullName();

        Assert.assertEquals("The employee full name is not in the correct format.", "Testerson, Test", fullName);
    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(5);

        Assert.assertEquals("The employee raise of 5% was not computed correctly.",employee.getSalary(), 100 * 1.05, 0.0);
    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(-10); //"raise" by negative 10%

        Assert.assertEquals("Salary should remain the same when raise percentage is negative.",100, employee.getSalary(),0.0);
    }

    @Test
    public void get_employee_balance_due_with_50_percent_walking_discount_1() {
        Employee employee = new Employee("Joe", "Sixpack");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Nail Trim", 12.00);
        testMap.put("Walking", 23.00);
        testMap.put("Bathing", 25.00);
        testMap.put("Boarding", 40.00);
        testMap.put("Grooming", 35.00);

        double methodTotal = employee.getBalanceDue(testMap);

        Assert.assertEquals("The employee's balance due is not correct.", 123.50, methodTotal, 0.0);
    }

    @Test
    public void get_employee_balance_due_with_50_percent_walking_discount_2() {
        Employee employee = new Employee("Joe", "Sixpack");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Nail Trim", 12.00);
        testMap.put("wAlKiNg", 23.00);      //makes sure equalsIgnoreCase() is working
        testMap.put("Bathing", 25.00);
        testMap.put("Boarding", 40.00);
        testMap.put("Grooming", 35.00);

        double methodTotal = employee.getBalanceDue(testMap);

        Assert.assertEquals("The employee's balance due is not correct.", 123.50, methodTotal, 0.0);
    }

    @Test
    public void get_employee_balance_due_with_50_percent_walking_discount_3() {
        Employee employee = new Employee("Joe", "Sixpack");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Nail Trim", 12.00);
        testMap.put("     Walking    ", 23.00);      //adds whitespace to make sure trim() is working
        testMap.put("Bathing", 25.00);
        testMap.put("Boarding", 40.00);
        testMap.put("Grooming", 35.00);

        double methodTotal = employee.getBalanceDue(testMap);

        Assert.assertEquals("The employee's balance due is not correct.", 123.50, methodTotal, 0.0);
    }

    @Test
    public void get_employee_balance_due_with_no_walking_services() {
        Employee employee = new Employee("Joe", "Sixpack");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Nail Trim", 12.00);
        testMap.put("Training", 23.00);
        testMap.put("Bathing", 25.00);
        testMap.put("Boarding", 40.00);
        testMap.put("Grooming", 35.00);

        double methodTotal = employee.getBalanceDue(testMap);

        Assert.assertEquals("The employee's balance due is not correct.", 135.00, methodTotal, 0.0);
    }

    @Test
    public void get_employee_balance_due_on_empty_map() {
        Employee employee = new Employee("Joe", "Sixpack");
        Map<String, Double> testMap = new HashMap<>();

        double methodTotal = employee.getBalanceDue(testMap);

        Assert.assertEquals("The employee's balance due is not correct.", 0.00, methodTotal, 0.0);
    }

}
