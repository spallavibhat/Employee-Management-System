package com.pallavi.employee;

import java.util.Scanner;

public class EmployeeManagementSystem {

    private EmployeeService service = new EmployeeService();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n=== EMPLOYEE MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. View All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: addEmployee(); break;
                case 2: removeEmployee(); break;
                case 3: service.showAllEmployees(); break;
                case 4: System.exit(0);
                default: System.out.println("Invalid Option!");
            }
        }
    }

    private void addEmployee() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        service.addEmployee(new Employee(id, name, dept, salary));
    }

    private void removeEmployee() {
        System.out.print("Enter Employee ID to remove: ");
        int id = scanner.nextInt();
        service.removeEmployee(id);
    }
}
