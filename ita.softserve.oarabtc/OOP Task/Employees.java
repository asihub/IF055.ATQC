import java.util.ArrayList;

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

    public static void printEmployeeList(ArrayList<Employees> PayEmployee) {
        PayEmployee.forEach(Employees -> System.out.println(
                "(id " + Employees.getId() + ") " + Employees.getName() + " - " + Employees.payCalc() + " $"));

    }

    public static void printFirstEmployeeList(ArrayList<Employees> PayEmployee, int id, String name) {
        int i = id;
        for (i = 0; i < 5; i++) {System.out.println(PayEmployee.get(i).getName());
        }
    }

    public static void printLastEmployeeList(ArrayList<Employees> PayEmployee, int id, String name) {
        int i = id;
        for (i = 7; i < 10; i++) {System.out.println(PayEmployee.get(i).getName());
        }
    }
}
