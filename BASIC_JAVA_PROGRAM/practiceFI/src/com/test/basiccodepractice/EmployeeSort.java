package com.test.basiccodepractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSort implements Comparable<EmployeeSort>{
    private String name;
    private Integer employeeId;

    public EmployeeSort(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(EmployeeSort otherEmployee) {
        // Compare employees based on their names
        return this.name.compareTo(otherEmployee.getName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }
    public static void main(String[] args) {
        List<EmployeeSort> employees = new ArrayList<>();
        employees.add(new EmployeeSort("David", 104));
        employees.add(new EmployeeSort("Bob", 102));
        employees.add(new EmployeeSort("Charlie", 103));
        employees.add(new EmployeeSort("Alice", 101));
        employees.add(new EmployeeSort("Eve", 105));

        Collections.sort(employees);

        for (EmployeeSort employee : employees) {
            System.out.println(employee);
        }
    }

}
