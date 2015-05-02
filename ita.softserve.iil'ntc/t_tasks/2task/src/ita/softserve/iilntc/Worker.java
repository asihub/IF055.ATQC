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

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    abstract public double monthlySalary();

    //TODO use toString() override - FIXED
    @Override
    public String toString(){
        return "ID " + id + " Name " + name + " Surname " + surname + " Payment " + monthlySalary() + " $";
    }
}

