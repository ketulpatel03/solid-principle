package com.java.SingleResponsibilityPrinciple;

public class SingleResponsibilityPrincipleExample {

    public static class Employee {

        public double calculateHours() {
            // logic to calculate employee hours : used by HR
            return 40;
        }

        public double calculateSalary() {
            // logic to calculate employee salary : used by CFO
            double employeeHours = calculateHours();
            return 10000 * employeeHours;
        }

        public void saveEmployee() {
            // logic to save employee in database : used by Tech
        }

    }

    // Here, calculateHours method is internally used to calculate employee salary by CFO.
    // A change is required in the calculateHours() method by the CFO and this will affect the functionality used by the HR.
    // So, this class violates the Single Responsibility Principle

    // To fix this, we can divide above 3 functions to 3 different classes and
    // will be assigned to responsible actor like HR, CFO and Tech
}
