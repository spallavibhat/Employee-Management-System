package com.pallavi.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added successfully!");
    }

    public void removeEmployee(int id) {
        employees.removeIf(e -> e.getId() == id);
        System.out.println("Employee removed successfully!");
    }

    public void showAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            employees.forEach(System.out::println);
        }
    }
}
