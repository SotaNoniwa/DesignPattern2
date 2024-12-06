package com.iterator;

import java.util.List;

public class HRDepartment {

    EmployeeList listA;
    EmployeeList listB;

    public HRDepartment(EmployeeList listA, EmployeeList listB) {
        this.listA = listA;
        this.listB = listB;
    }

    public void printEmployee() {
        Iterator listAIterator = listA.createIterator();
        Iterator listBIterator = listB.createIterator();

        System.out.println("--- Employees in " + listA.getCompanyName() + " ---");
        printEmployee(listAIterator);
        System.out.println("--- Employees in " + listB.getCompanyName() + " ---");
        printEmployee(listBIterator);
    }

    private void printEmployee(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
