package ita.softserve.idyntc;

import java.util.ArrayList;
import java.util.List;


public class Task1 {
    public static void main(String[] args) {

        //TODO what list?
        List<Employee> list = new ArrayList<Employee>(10);

        list.add(0, new PerHourSalaryEmployee(0, "Ivan", "Ivaniv", 10));
        list.add(1, new PerHourSalaryEmployee(1, "Petro", "Petriv", 8));
        list.add(2, new PerHourSalaryEmployee(2, "Vasil", "Vasyliv", 11));

        list.add(3, new FixedSalaryEmployee(3, "Igor", "Igorenko", 2500));
        list.add(4, new FixedSalaryEmployee(4, "Maksym", "Maksymenko", 2500));
        list.add(5, new FixedSalaryEmployee(5, "Oleg", "Olegko", 2500));

        //TODO what's emp?
        for (Employee emp : list) {
            System.out.println(emp);
        }
    }
}
