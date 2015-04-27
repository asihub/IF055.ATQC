package ita.softserve.oolektc;


public class HourlyWageEmployee extends Employee {

    private double hourlyWage;

    public HourlyWageEmployee(int id, String name, String surname, double hourlyWage) {
        super(id, name, surname);
        this.hourlyWage = hourlyWage;
        this.monthlyWage = getMonthlyWage();
    }

    @Override
    public double getMonthlyWage() {
        return 20.8 * 8 * hourlyWage;

    }
}

