package ita.softserve.akorctc;
//TODO rename class to something more informative - FixedSalaryWorker etc
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
