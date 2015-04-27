package ita.softserve.oolektc;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[4];

        employees[0] = new HourlyWageEmployee(1, "John","Smith", 12);
        employees[1] = new HourlyWageEmployee(2, "Sue","Calahan", 9);
        employees[2] = new FixedWageEmployee(3, "Jack","Black", 300);
        employees[3] = new FixedWageEmployee(4, "Eve","Stone", 270);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}
