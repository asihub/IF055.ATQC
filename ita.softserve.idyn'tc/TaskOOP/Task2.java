package ita.softserve.idyntc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Task2 {
    public static void main(String[] args) {
        //TODO it's a list, so name it appropiate
        List<Employee> fixedSalaryEmployee = new ArrayList<Employee>();
        List<Employee> perHourSalaryEmployee = new ArrayList<Employee>();

        fixedSalaryEmployee.add(new FixedSalaryEmployee(1, "Christine", "Haas", 3000));
        fixedSalaryEmployee.add(new FixedSalaryEmployee(2, "Michael", "Thompson", 3000));
        fixedSalaryEmployee.add(new FixedSalaryEmployee(3, "Sally", "Kwan", 3400));
        fixedSalaryEmployee.add(new FixedSalaryEmployee(4, "John", "Geyer", 3000));
        fixedSalaryEmployee.add(new FixedSalaryEmployee(5, "Irving", "Stern", 3000));
        fixedSalaryEmployee.add(new FixedSalaryEmployee(6, "Eva", "Pulanski", 3300));
        fixedSalaryEmployee.add(new FixedSalaryEmployee(7, "Dan", "Henderson", 3000));
        fixedSalaryEmployee.add(new FixedSalaryEmployee(8, "Theodore", "Spenser", 3200));
        fixedSalaryEmployee.add(new FixedSalaryEmployee(9, "Sean", "O'Connel", 3100));
        fixedSalaryEmployee.add(new FixedSalaryEmployee(10, "Vinchenzo", "Luchessi", 3000));

        perHourSalaryEmployee.add(new PerHourSalaryEmployee(1, "Mike", "Chastain", 11));
        perHourSalaryEmployee.add(new PerHourSalaryEmployee(2, "John", "Maki", 10));
        perHourSalaryEmployee.add(new PerHourSalaryEmployee(3, "Cory", "Moore", 10));
        perHourSalaryEmployee.add(new PerHourSalaryEmployee(4, "Kelly", "Hyvonen", 11));
        perHourSalaryEmployee.add(new PerHourSalaryEmployee(5, "Steve", "Kieffer", 7));
        perHourSalaryEmployee.add(new PerHourSalaryEmployee(6, "Jeff", "Arnold", 7));
        perHourSalaryEmployee.add(new PerHourSalaryEmployee(7, "John", "Stalder", 10));
        perHourSalaryEmployee.add(new PerHourSalaryEmployee(8, "Eric", "Hunter", 8));
        perHourSalaryEmployee.add(new PerHourSalaryEmployee(9, "Michael", "Stunt", 8));
        perHourSalaryEmployee.add(new PerHourSalaryEmployee(10, "Hurry", "Nevil", 14));

        fixedSalaryEmployee.sort(new EmployeesComparator());

        System.out.println("Ordered list of fixedSalaryEmployee:");
        //TODO you already have a method for printing, use it or overload and then use it
        for (Employee employee : fixedSalaryEmployee) {
            System.out.println(employee);
        }

        System.out.println("First five employees names from ordered list of fixedSalaryEmployee:");
        Employee.outputEmployee(fixedSalaryEmployee, 0, 4, "Name");

        System.out.println("Last three employee's ID from ordered list of fixedSalaryEmployee:");
        Employee.outputEmployee(fixedSalaryEmployee, 7, 9, "ID");

        perHourSalaryEmployee.sort(new EmployeesComparator());

        System.out.println("Ordered list of perHourSalaryEmployee");
        //TODO you already have a method for printing, use it or overload and then use it
        for (Employee employee : perHourSalaryEmployee) {
            System.out.println(employee);
        }

        System.out.println("First five employees names from list of perHourSalaryEmployee:");
        Employee.outputEmployee(perHourSalaryEmployee, 0, 4, "Name");

        System.out.println("Last three employees ID from list of perHourSalaryEmployee:");
        Employee.outputEmployee(perHourSalaryEmployee, 7, 9, "ID");

    }

}

