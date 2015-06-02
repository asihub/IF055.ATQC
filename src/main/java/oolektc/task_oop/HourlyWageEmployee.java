package oolektc.task_oop;

public class HourlyWageEmployee extends Employee {
    private double numberOfWorkdays;
    private double numberOfWorkHours;
    private double hourlyWage;

    public HourlyWageEmployee(int id, String name, String lastName, double hourlyWage, double numberOfWorkdays, double numberOfWorkhours) {
        super(id, name, lastName);
        this.hourlyWage = hourlyWage;
        this.numberOfWorkdays = numberOfWorkdays;
        this.numberOfWorkHours = numberOfWorkhours;
        this.monthlyWage = getMonthlyWage();
    }

    @Override
    public double getMonthlyWage() {
        return numberOfWorkdays * numberOfWorkHours * hourlyWage;
    }
}

