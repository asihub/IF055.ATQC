package akorctc.task_oop;

public class HourlySalaryWorker extends Worker {

    private double hourlySalary;

    public HourlySalaryWorker(int id, String name, String lastname, double hourlySalary) {
        super(id, name, lastname);
        this.hourlySalary = 10;
        this.monthlyIncome = getMonthlyIncome();
    }

    @Override
    public double getMonthlyIncome() {
        return 20.8*8*hourlySalary;

    }

    public String getLastName(){
        return this.lastname;
    }
}
