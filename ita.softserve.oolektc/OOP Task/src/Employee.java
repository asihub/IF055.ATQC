import java.util.List;

public abstract class Employee {

    final private int id;
    final private String firstName;
    final private String lastName;
    protected double monthlyWage;

    public Employee(int id, String name, String surname) {
        this.id = id;
        this.firstName = name;
        this.lastName = surname;
    }

    public abstract double getMonthlyWage();

    //TODO use toString() method override instead of this - FIXED
    @Override
    public String toString() {
        StringBuilder employeeInfo = new StringBuilder("");
        employeeInfo.append(id).append(" ").append(firstName).append(" ")
                .append(lastName).append(" ").append(monthlyWage);
        return employeeInfo.toString();
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public static void printEmployeeList(List<Employee> list) {
        list.forEach(System.out::println);
    }

    /**
     * Prints out the first n elements from a list.
     *
     * @param list   name of the list
     * @param number number of elements to be printed
     * @param field  name of an element field to be printed
     */
    public static void printLastElementsFromList(List<Employee> list, int number, String field) {
        switch (field) {
            case "id":
                System.out.println();
                list.stream().limit(number).forEach(n -> System.out.println(n.getId()));
                break;
            case "first name":
                System.out.println();
                list.stream().limit(number).forEach(n -> System.out.println(n.getFirstName()));
                break;
            case "last name":
                System.out.println();
                list.stream().limit(number).forEach(n -> System.out.println(n.getLastName()));
                break;
            default:
                System.out.println("Wrong parameter, use `id`, `first name` or `last name`");
        }
    }

    /**
     * Prints out the last n elements from a list.
     *
     * @param list   name of the list
     * @param number number of elements to be printed
     * @param field  name of an element field to be printed
     */
    public static void printFirstElementsFromList(List<Employee> list, int number, String field) {
        switch (field) {
            case "id":
                System.out.println();
                list.stream().skip(list.size() - number).forEach(n -> System.out.println(n.getId()));
                break;
            case "first name":
                System.out.println();
                list.stream().skip(list.size() - number).forEach(n -> System.out.println(n.getFirstName()));
                break;
            case "last name":
                System.out.println();
                list.stream().skip(list.size() - number).forEach(n -> System.out.println(n.getLastName()));
                break;
            default:
                System.out.println("Wrong parameter, use `id`, `first name` or `last name`");
        }
    }
}
