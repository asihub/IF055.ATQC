package ita.softserve.idyntc;

import java.util.ArrayList;
import java.util.List;


public class Task1 {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(0, new PerHourSalaryEmployee(0, "Ivan", "Ivaniv", 10));
        employeeList.add(1, new PerHourSalaryEmployee(1, "Petro", "Petriv", 8));
        employeeList.add(2, new PerHourSalaryEmployee(2, "Vasil", "Vasyliv", 11));

        employeeList.add(3, new FixedSalaryEmployee(3, "Igor", "Igorenko", 2500));
        employeeList.add(4, new FixedSalaryEmployee(4, "Maksym", "Maksymenko", 2500));
        employeeList.add(5, new FixedSalaryEmployee(5, "Oleg", "Olegko", 2500));

        for (Employee employee : employeeList) {

            System.out.println(employee);
        }
    }

}

