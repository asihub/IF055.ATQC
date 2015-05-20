/*
* Copyright (C) 2015 TaskOOP Project by Ihor Dynka
 */

package ita.softserve.idyntc;

import java.util.Comparator;

/**
 * compares employees
 */
public class EmployeesComparator implements Comparator<Employee> {
    /**
     * helps to compare employees for their salary. If their salary are equals that it compares for their names
     *
     * @param emp1 employee1
     * @param emp2 employee2
     * @return difference between employee1 and employee2
     */
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int result = (int) (emp1.getSalary() - emp2.getSalary());
        if (result != 0) {
            return result;
        } else {
            return emp1.getSurname().compareTo(emp2.getSurname());
        }


    }
}
