package ita.softserve.akorctc;

public class HourlySalary extends Worker {

    private double hourlySalary;

    public HourlySalary(int id, String name, String lastname, double hourlySalary) {
        super(id, name, lastname);
        this.hourlySalary = 10;
        this.monthlyIncome = getMonthlyIncome();
    }

    @Override
    public double getMonthlyIncome() {
        return 20.8*8*hourlySalary;

    }
}
