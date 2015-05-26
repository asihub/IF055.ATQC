package oolektc.task_oop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        final List<Employee> fixedWageEmployees = new ArrayList<>();
        fixedWageEmployees.add(new FixedWageEmployee(1, "Bruce", "Allen", 350));
        fixedWageEmployees.add(new FixedWageEmployee(2, "Jessica", "Flores", 255));
        fixedWageEmployees.add(new FixedWageEmployee(3, "Laurena", "Alf", 150));
        fixedWageEmployees.add(new FixedWageEmployee(4, "Louise", "Lenox", 278));
        fixedWageEmployees.add(new FixedWageEmployee(5, "Agnes", "Alannis", 480));
        fixedWageEmployees.add(new FixedWageEmployee(6, "Bessie", "Gibson", 350));
        fixedWageEmployees.add(new FixedWageEmployee(7, "James", "Ortiz", 412));
        fixedWageEmployees.add(new FixedWageEmployee(8, "Ruby", "Hall", 300));
        fixedWageEmployees.add(new FixedWageEmployee(9, "Beverley", "Burke", 125));
        fixedWageEmployees.add(new FixedWageEmployee(10, "Earl", "Balters", 350));

        final List<Employee> hourlyWageEmployees = new ArrayList<>();
        hourlyWageEmployees.add(new HourlyWageEmployee(1, "Dolores", "Sutton", 8.4, 20.8, 8));
        hourlyWageEmployees.add(new HourlyWageEmployee(2, "Shelley ", "Henry", 8.2, 20.8, 8));
        hourlyWageEmployees.add(new HourlyWageEmployee(3, "Erik", "Rockwood", 7.9, 20.8, 8));
        hourlyWageEmployees.add(new HourlyWageEmployee(4, "Willette", "Benton", 8.9, 20.8, 8));
        hourlyWageEmployees.add(new HourlyWageEmployee(5, "Vera", "Kidd", 6.7, 20.8, 8));
        hourlyWageEmployees.add(new HourlyWageEmployee(6, "Oralia", "Tressler", 8.2, 20.8, 8));
        hourlyWageEmployees.add(new HourlyWageEmployee(7, "Stevie", "Gilmore", 8.2, 20.8, 8));
        hourlyWageEmployees.add(new HourlyWageEmployee(8, "Delphine", "Byrd", 5.1, 20.8, 8));
        hourlyWageEmployees.add(new HourlyWageEmployee(9, "Robert", "Dixon", 9, 20.8, 8));
        hourlyWageEmployees.add(new HourlyWageEmployee(10, "Norman", "McRae", 7.3, 20.8, 8));

        final Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getMonthlyWage)
                .thenComparing(Employee::getLastName);

        System.out.println("Fixed wage employee list:");
        Employee.printEmployeeList(fixedWageEmployees);

        System.out.println("\nSorted fixed wage employee list:");
        fixedWageEmployees.sort(employeeComparator);

        Employee.printEmployeeList(fixedWageEmployees);

        Employee.printFirstElementsFromList(fixedWageEmployees, 5, "first name");
        Employee.printLastElementsFromList(fixedWageEmployees, 3, "id");

        System.out.println("\nHourly wage employee list:");
        Employee.printEmployeeList(hourlyWageEmployees);

        System.out.println("\nSorted hourly wage employee list:");
        hourlyWageEmployees.sort(employeeComparator);
        Employee.printEmployeeList(hourlyWageEmployees);

        Employee.printFirstElementsFromList(hourlyWageEmployees, 5, "first name");
        Employee.printLastElementsFromList(hourlyWageEmployees, 3, "id");
    }
}
