package ita.softserve.idyntc;

import java.util.ArrayList;
import java.util.List;


public class Task2 {
    public static void main(String[] args) {
        //TODO it's a list, so name it appropiate  - Fixed
        List<Employee> fixedSalaryEmployeeList = new ArrayList<Employee>();
        List<Employee> perHourSalaryEmployeeList = new ArrayList<Employee>();

        fixedSalaryEmployeeList.add(new FixedSalaryEmployee(1, "Christine", "Haas", 3000));
        fixedSalaryEmployeeList.add(new FixedSalaryEmployee(2, "Michael", "Thompson", 3000));
        fixedSalaryEmployeeList.add(new FixedSalaryEmployee(3, "Sally", "Kwan", 3400));
        fixedSalaryEmployeeList.add(new FixedSalaryEmployee(4, "John", "Geyer", 3000));
        fixedSalaryEmployeeList.add(new FixedSalaryEmployee(5, "Irving", "Stern", 3000));
        fixedSalaryEmployeeList.add(new FixedSalaryEmployee(6, "Eva", "Pulanski", 3300));
        fixedSalaryEmployeeList.add(new FixedSalaryEmployee(7, "Dan", "Henderson", 3000));
        fixedSalaryEmployeeList.add(new FixedSalaryEmployee(8, "Theodore", "Spenser", 3200));
        fixedSalaryEmployeeList.add(new FixedSalaryEmployee(9, "Sean", "O'Connel", 3100));
        fixedSalaryEmployeeList.add(new FixedSalaryEmployee(10, "Vinchenzo", "Luchessi", 3000));

        perHourSalaryEmployeeList.add(new PerHourSalaryEmployee(1, "Mike", "Chastain", 11));
        perHourSalaryEmployeeList.add(new PerHourSalaryEmployee(2, "John", "Maki", 10));
        perHourSalaryEmployeeList.add(new PerHourSalaryEmployee(3, "Cory", "Moore", 10));
        perHourSalaryEmployeeList.add(new PerHourSalaryEmployee(4, "Kelly", "Hyvonen", 11));
        perHourSalaryEmployeeList.add(new PerHourSalaryEmployee(5, "Steve", "Kieffer", 7));
        perHourSalaryEmployeeList.add(new PerHourSalaryEmployee(6, "Jeff", "Arnold", 7));
        perHourSalaryEmployeeList.add(new PerHourSalaryEmployee(7, "John", "Stalder", 10));
        perHourSalaryEmployeeList.add(new PerHourSalaryEmployee(8, "Eric", "Hunter", 8));
        perHourSalaryEmployeeList.add(new PerHourSalaryEmployee(9, "Michael", "Stunt", 8));
        perHourSalaryEmployeeList.add(new PerHourSalaryEmployee(10, "Hurry", "Nevil", 14));

        fixedSalaryEmployeeList.sort(new EmployeesComparator());

        System.out.println("Ordered list of fixedSalaryEmployeeList:");
        Employee.printEmployeeFromRange(fixedSalaryEmployeeList, 0, 9);

        System.out.println("First five employees names from ordered list of fixedSalaryEmployeeList:");
        Employee.printEmployeeFromRange(fixedSalaryEmployeeList, 0, 4, "Name");

        System.out.println("Last three employee's ID from ordered list of fixedSalaryEmployeeList:");
        Employee.printEmployeeFromRange(fixedSalaryEmployeeList, 7, 9, "ID");

        perHourSalaryEmployeeList.sort(new EmployeesComparator());

        System.out.println("Ordered list of perHourSalaryEmployeeList");
        Employee.printEmployeeFromRange(perHourSalaryEmployeeList, 0, 9);

        System.out.println("First five employees names from list of perHourSalaryEmployeeList:");
        Employee.printEmployeeFromRange(perHourSalaryEmployeeList, 0, 4, "Name");

        System.out.println("Last three employees ID from list of perHourSalaryEmployeeList:");
        Employee.printEmployeeFromRange(perHourSalaryEmployeeList, 7, 9, "ID");

    }

}

