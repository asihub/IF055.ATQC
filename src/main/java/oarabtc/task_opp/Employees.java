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
    
    public static void printRangeFromListEmployee(List<Employees> PayEmployee, int id, int k, String name) {
        // k - is list parameters
        int i = id;
        for (i = id; i < k; i++) {System.out.println(PayEmployee.get(i).getName());
        }
    }
}
