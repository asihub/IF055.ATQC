package akorctc.task_oop;

public class FixedSalaryWorker extends Worker{

    private double fixedSalary;

    public FixedSalaryWorker(int id, String name, String lastname, double fixedSalary) {
        super(id, name, lastname);
        this.fixedSalary = fixedSalary;
        this.monthlyIncome = getMonthlyIncome();
    }

    @Override
    public double getMonthlyIncome() {
        return fixedSalary;

    }

    public String getLastName(){
        return this.lastname;
    }
}
