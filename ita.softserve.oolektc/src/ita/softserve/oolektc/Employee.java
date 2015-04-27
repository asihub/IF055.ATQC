package ita.softserve.oolektc;


public abstract class Employee {

    public Employee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    protected int id;
    protected String name;
    protected String surname;
    protected double monthlyWage;

    public abstract double getMonthlyWage();
    //TODO use toString() method override instead of this
    public void getEmployeeInfo(){
        StringBuilder sb = new StringBuilder("");
        sb.append(id).append(" ").append(name).append(" ").append(surname).append(" ").append(monthlyWage);

        System.out.println(sb);
    }
}
