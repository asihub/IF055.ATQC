package oolektc.task_oop;

public class HourlyWageEmployee extends Employee {
    private double numberOfWorkdays;
    private double numberOfWorkhours;
    private double hourlyWage;

    public HourlyWageEmployee(int id, String name, String lastName, double hourlyWage, double numberOfWorkdays, double numberOfWorkhours) {
        super(id, name, lastName);
        this.hourlyWage = hourlyWage;
        this.numberOfWorkdays = numberOfWorkdays;
        this.numberOfWorkhours = numberOfWorkhours;
        this.monthlyWage = getMonthlyWage();
    }

    public double getNumberOfWorkdays() {
        return numberOfWorkdays;
    }

    public void setNumberOfWorkdays(double numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
    }

    public double getNumberOfWorkhours() {
        return numberOfWorkhours;
    }

    public void setNumberOfWorkhours(double numberOfWorkhours) {
        this.numberOfWorkhours = numberOfWorkhours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double getMonthlyWage() {
        return numberOfWorkdays * numberOfWorkhours * hourlyWage;
    }
}

