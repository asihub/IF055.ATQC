package oolektc.collections;

import oolektc.task_oop.Employee;

public class HourlyWageEmployee extends Employee {

    private static final double WORK_DAYS = 20.8;
    private static final double WORK_HOURS = 8;
    private final double hourlyWage;

    public HourlyWageEmployee(int id, String name, String lastName, double hourlyWage) {
        super(id, name, lastName);
        this.hourlyWage = hourlyWage;
        this.monthlyWage = getMonthlyWage();
    }

    @Override
    public double getMonthlyWage() {
        return WORK_DAYS * WORK_HOURS * hourlyWage;
    }
}

