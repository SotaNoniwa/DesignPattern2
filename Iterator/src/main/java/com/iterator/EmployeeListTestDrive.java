package com.iterator;

public class EmployeeListTestDrive {

    public static void main(String[] args) {
        EmployeeListA listA = new EmployeeListA("Alpha Inc");
        EmployeeListB listB = new EmployeeListB("Beta Inc");
        HRDepartment hr = new HRDepartment(listA, listB);
        hr.printEmployee();
    }
}
