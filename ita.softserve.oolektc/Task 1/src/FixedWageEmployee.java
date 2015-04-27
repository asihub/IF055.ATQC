package ita.softserve.oolektc;


public class FixedWageEmployee extends Employee{

    private double fixedWage;

    public FixedWageEmployee(int id, String name, String surname, double fixedWage) {
        super(id, name, surname);
        this.fixedWage = fixedWage;
        this.monthlyWage = getMonthlyWage();
    }

    @Override
    public double getMonthlyWage() {
        return fixedWage;

    }
}

