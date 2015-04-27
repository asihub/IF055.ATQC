package ita.softserve.iilntc;

public abstract class Worker {

    private int id;
    private String name;
    private String surname;

    public Worker(int id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    abstract public double monthlySalary();
    //TODO use toString() override - FIXED
    @Override
    public String toString(){
        return "ID " + id + " Name " + name + " Surname " + surname + " Payment " + monthlySalary() + " $";
    }
}

