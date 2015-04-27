package ita.softserve.iilntc;

public abstract class WorkerStudy {

    private int id;
    private String name;
    private String surname;
    protected double payment;

    public WorkerStudy(int id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
    public double monthlySalary(){
        return payment;
    }

    public String getWorkerInformation(){
        return "ID " + id + " Name " + name + " Surname " + surname + " Payment " + monthlySalary() + " $";
    }
}

