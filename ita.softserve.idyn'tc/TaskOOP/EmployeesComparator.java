package ita.softserve.idyntc;

import java.util.Comparator;

public class EmployeesComparator implements Comparator<Employee> {
    /**
     * Method that helps to compare employees for their ordering
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
            return emp1.surname.compareTo(emp2.surname);
        }


    }
}
