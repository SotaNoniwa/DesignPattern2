package com.iterator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListB implements EmployeeList {

    private String companyName;
    private List<String> employees;

    public EmployeeListB(String companyName) {
        this.companyName = companyName;
        employees = new ArrayList<>();
        employees.add("Bob");
        employees.add("Bella");
        employees.add("Benjamin");
    }

    public void addEmployee(String name) {
        employees.add(name);
    }

    public Iterator createIterator() {
        return new EmployeeListBIterator(employees);
    }

    public String getCompanyName() {
        return companyName;
    }
}
