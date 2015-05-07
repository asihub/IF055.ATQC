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
        listForPrint.forEach(System.out::println);
    }

    public static void printRangeFromList(List<Worker> listForPrint, String field, int fromNumber, int toNumber) {
        switch (field) {
            case "id":
                listForPrint.stream()
                        .limit(toNumber)
                        .skip(fromNumber - 1)
                        .forEach(number -> System.out.println(number.getId()));
                break;
            case "name":
                listForPrint.stream()
                        .limit(toNumber)
                        .skip(fromNumber - 1)
                        .forEach(number -> System.out.println(number.getName()));
                break;
            case "surname":
                listForPrint.stream()
                        .limit(toNumber)
                        .skip(fromNumber - 1)
                        .forEach(number -> System.out.println(number.getSurname()));
                break;
            case "salary":
                listForPrint.stream()
                        .limit(toNumber)
                        .skip(fromNumber - 1)
                        .forEach(number -> System.out.println(number.monthlySalary()));
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

