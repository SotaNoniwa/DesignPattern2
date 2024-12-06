package com.iterator;

public class EmployeeListAIterator implements Iterator {

    private String[] employees;
    private int index = 0;

    public EmployeeListAIterator(String[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        if (index >= employees.length || employees[index] == null) {
            return false;
        }
        return true;
    }

    @Override
    public String next() {
        String employee = employees[index];
        index++;
        return employee;
    }
}
