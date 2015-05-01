
public abstract class Employee {

    final private int id;
    final private String firstName;
    final private String lastName;
    protected double monthlyWage;

    public Employee(int id, String name, String surname) {
        this.id = id;
        this.firstName = name;
        this.lastName = surname;
    }

    public abstract double getMonthlyWage();

    @Override
    public String toString() {
        StringBuilder employeeInfo = new StringBuilder("");
        employeeInfo.append(id).append(" ").append(firstName).append(" ")
                .append(lastName).append(" ").append(monthlyWage);
        return employeeInfo.toString();
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
}
