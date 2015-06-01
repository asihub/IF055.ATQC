package oarabtc.task_opp;

import java.util.List;

public abstract class Employees {

    private int id;
    private String name;
    private String surname;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Employees(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public abstract double payCalc();

    @Override
    public String toString() {
        return "Employee: " + getName() + " " + getSurname() + " - " + payCalc() + " $";
    }

    public static void printEmployeeList(List<Employees> PayEmployee) {
        PayEmployee.forEach(Employees -> System.out.println(
                "(id " + Employees.getId() + ") " + Employees.getName() + " - " + Employees.payCalc() + " $"));

    }

    /**
     * Prints out the first n elements from a list.
     *
     * @param parameter number of print elements
     */

    public static void printFirstFromListEmployee(List<Employees> PayEmployee, int parameter) {

        for (int firstId = 0; firstId < parameter; firstId++) {
            System.out.println(PayEmployee.get(firstId).getName());
        }
    }

    /**
     * Prints out the last n elements from a list.
     *
     * @param quantity   number of all elements in list
     * @param parameter number of print elements
     */

    public static void printLastFromListEmployee(List<Employees> PayEmployee, int quantity, int parameter) {
        for (int i = (quantity - parameter); i < quantity; i++) {
            System.out.println(PayEmployee.get(i).getName());
        }
    }
}
