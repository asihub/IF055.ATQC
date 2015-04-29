
public class Employee {
    private static int count = 0;

    private int id;
    private String name;
    private int numberOfObject;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        count++;
        numberOfObject = count;
    }

    public int getNumberOfObject() {
        return numberOfObject;
    }

    @Override
    public String toString() {
        return "Employee id: " + id +  "  name: " + name;
    }
}
