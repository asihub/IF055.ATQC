package ita.softserve.akorctc;

public abstract class Worker {

    public Worker(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    protected int id;
    protected String name;
    protected String lastname;
    protected double monthlyIncome;

    public abstract double getMonthlyIncome();

    public void getWorkerInfo() {
        StringBuilder result = new StringBuilder("");
        result.append(id).append(" ").append(name).append(" ").append(lastname).append(" ").append(monthlyIncome);

        System.out.println("|Mounthly Salary is| - |" + result);
    }
}



