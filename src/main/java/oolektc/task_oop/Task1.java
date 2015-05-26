package oolektc.task_oop;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        final List<Employee> employees = new ArrayList<>();

        employees.add(new HourlyWageEmployee(1, "John", "Smith", 12, 20.8, 8));
        employees.add(new HourlyWageEmployee(2, "Sue", "Calahan", 9, 20.8, 8));
        employees.add(new FixedWageEmployee(3, "Jack", "Black", 300));
        employees.add(new FixedWageEmployee(4, "Eve", "Stone", 270));

        employees.forEach(System.out::println);
    }

}
