package com.iterator;

import java.util.List;

public class EmployeeListBIterator implements Iterator {

    List<String> employees;
    int index = 0;

    public EmployeeListBIterator(List<String> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        if (index >= employees.size() || employees.get(index) == null) {
            return false;
        }
        return true;
    }

    @Override
    public String next() {
        String employee = employees.get(index);
        index++;
        return employee;
    }
}
