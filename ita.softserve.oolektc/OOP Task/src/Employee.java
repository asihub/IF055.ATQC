import java.util.List;

public abstract class Employee {

    protected double monthlyWage;
    private final int id;
    private final String firstName;
    private final String lastName;

    public Employee(int id, String name, String lastName) {
        this.id = id;
        this.firstName = name;
        this.lastName = lastName;
    }

    public final int getId() {
        return id;
    }

    public final String getLastName() {
        return lastName;
    }

    public final String getFirstName() {
        return firstName;
    }

    public abstract double getMonthlyWage();

    @Override
    public String toString() {
        return "" + id + " " + firstName + " " + lastName + " " + monthlyWage;
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
        switch (field.toLowerCase()) {
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
        switch (field.toLowerCase()) {
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
