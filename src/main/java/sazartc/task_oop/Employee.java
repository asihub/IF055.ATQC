package sazartc.task_oop;

/**
 * Abstract class described Employee' properties
 */
//TODO move out txt files to /src/main/resources
abstract public class Employee implements Comparable<Employee> {

    protected int id;
    protected String name;
    protected String surname;
    protected double salaryBase;

    public Employee(int id, String surname, String name, double salaryBase) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salaryBase = salaryBase;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public double calculateSalary();

    @Override
    public String toString() {
        return String.format("[%d] %s %s: %.2f", this.id, this.surname,
                this.name, calculateSalary());
    }

    @Override
    public int compareTo(Employee employee) {
        if (this.calculateSalary() < employee.calculateSalary()) {
            return -1;
        } else if (this.calculateSalary() > employee.calculateSalary()) {
            return 1;
        } else {
            if (this.surname.compareTo(employee.surname) < 0) {
                return -1;
            } else if (this.surname.compareTo(employee.surname) > 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }


}
