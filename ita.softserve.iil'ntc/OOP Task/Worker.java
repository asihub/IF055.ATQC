package ita.softserve.iilntc;

import java.util.List;

public abstract class Worker {

    private int id;
    private String name;
    private String surname;

    public Worker(int id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    //Getters with setters have been added.
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
    
    public static void printListOfWorkers(List <Worker> listForPrint){
        //TODO for each
        for (int i = 0; i < listForPrint.size(); i++) System.out.println(listForPrint.get(i));
    }
    //TODO printRangeFromList() ?
    public static void printPartOfListOfWorkers(List <Worker> listForPrint, String field, int fromNumber, int toNumber) {
        //TODO switch() !!!
        if (field.equals("id")) {
            for (int i = fromNumber - 1; i < toNumber; i++) System.out.println(listForPrint.get(i).getId());
        }
        else if (field.equals("name")) {
            for (int i = fromNumber - 1; i < toNumber; i++) System.out.println(listForPrint.get(i).getName());
        }
        else if (field.equals("surname")) {
            for (int i = fromNumber - 1; i < toNumber; i++) System.out.println(listForPrint.get(i).getSurname());
        }
        else if (field.equals("salary")) {
            for (int i = fromNumber - 1; i < toNumber; i++) System.out.println(listForPrint.get(i).monthlySalary());
        }
        else {
            System.out.println("Please put correct field (id, name, surname or salary) and try again!");
        }
    }
    
    @Override
    public String toString(){
        return "ID " + id + " Name " + name + " Surname " + surname + " Payment " + monthlySalary() + " $";
    }
}

