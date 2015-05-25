package akorctc.task_oop;

public class HourlySalaryWorker extends Worker {

    private double hourlySalary;

    public HourlySalaryWorker(int id, String name, String lastname, double hourlySalary) {
        super(id, name, lastname);
        //TODO move out
        this.hourlySalary = 10;
        this.monthlyIncome = getMonthlyIncome();
    }

    @Override
    public double getMonthlyIncome() {
        //TODO move numbers out to a class field and provide getters\setters
        return 20.8*8*hourlySalary;

    }

    public String getLastName(){
        return this.lastname;
    }
}
