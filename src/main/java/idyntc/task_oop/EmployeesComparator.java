/*
* Copyright (C) 2015 TaskOOP Project by Ihor Dynka
 */

package idyntc.task_oop;

import java.util.Comparator;

/**
 * compares employees
 */
public class EmployeesComparator implements Comparator<Employee> {
    /**
     * helps to compare employees for their salary. If their salary are equals that it compares for their names
     *
     * @param employee1 employee1
     * @param employee2 employee2
     * @return difference between employee1 and employee2
     */
    @Override
    public int compare(Employee employee1, Employee employee2) {
        int result = (int) (employee1.getSalary() - employee2.getSalary());
        if (result != 0) {
            return result;
        } else {
            return employee1.getSurname().compareTo(employee2.getSurname());
        }


    }
}
