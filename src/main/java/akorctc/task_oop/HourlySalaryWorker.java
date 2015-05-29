package akorctc.task_oop;

public class HourlySalaryWorker extends Worker {

    private double hourlySalary;
    //TODO what's hourSal?
    private double hourSal = 20.8;
    private int hours = 8;

    public HourlySalaryWorker(int id, String name, String lastname, double hourlySalary) {
        super(id, name, lastname);
        //TODO move out
        this.hourlySalary = 10;
        this.monthlyIncome = getMonthlyIncome();
    }

    @Override
    public double getMonthlyIncome() {
        return hourSal * hours * hourlySalary;

    }

    public String getLastName() {
        return this.lastname;
    }
}
