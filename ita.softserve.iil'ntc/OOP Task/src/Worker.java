import java.util.List;

public abstract class Worker {

    private int id;
    private String name;
    private String surname;

    public Worker(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    //Getters with setters have been added.
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    abstract public double monthlySalary();

    public static void printListOfWorkers(List<Worker> listForPrint) {
        for (Worker co_worker : listForPrint) System.out.println(co_worker);
    }

    public static void printRangeFromList(List<Worker> listForPrint, String field, int fromNumber, int toNumber) {
        switch (field) {
            case "id":
                for (int i = fromNumber - 1; i < toNumber; i++) System.out.println(listForPrint.get(i).getId());
                break;
            case "name":
                for (int i = fromNumber - 1; i < toNumber; i++) System.out.println(listForPrint.get(i).getName());
                break;
            case "surname":
                for (int i = fromNumber - 1; i < toNumber; i++) System.out.println(listForPrint.get(i).getSurname());
                break;
            case "salary":
                for (int i = fromNumber - 1; i < toNumber; i++) System.out.println(listForPrint.get(i).monthlySalary());
                break;
            default:
                System.out.println("Please put correct field (id, name, surname or salary) and try again!");
                break;
        }
    }

    @Override
    public String toString() {
        return "ID " + id + " Name " + name + " Surname " + surname + " Payment " + monthlySalary() + " $";
    }

}

