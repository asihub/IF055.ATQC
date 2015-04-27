package ita.softserve.akorctc;

public class FixedSalary extends Worker{

    private double fixedSalary;

    public FixedSalary(int id, String name, String lastname, double fixedSalary) {
        super(id, name, lastname);
        this.fixedSalary = fixedSalary;
        this.monthlyIncome = getMonthlyIncome();
    }

    @Override
    public double getMonthlyIncome() {
        return fixedSalary;

    }
}
