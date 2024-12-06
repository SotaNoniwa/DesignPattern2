package com.iterator;

public class EmployeeListA implements EmployeeList{

    private String companyName;
    private String[] employees;
    private int SIZE = 3;
    private int index = 0;

    public EmployeeListA(String companyName) {
        this.companyName = companyName;
        employees = new String[SIZE];
        addEmployee("Alice");
        addEmployee("Alisha");
        addEmployee("Alex");
    }

    public void addEmployee(String name) {
        employees[index] = name;
        index++;
    }

    public Iterator createIterator() {
        return new EmployeeListAIterator(employees);
    }

    public String getCompanyName() {
        return companyName;
    }
}
