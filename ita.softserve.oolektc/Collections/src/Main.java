import java.util.*;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee(101, "John Frusciante");
        Employee employee2 = new Employee(102, "Jimi Hendrix");
        Employee employee3 = new Employee(103, "John Lennon");
        Employee employee4 = new Employee(104, "Eddie Vedder");
        Employee employee5 = new Employee(105, "Jack White");
        Employee employee6 = new Employee(106, "Mick Jagger");

        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);

        Map<Integer, Employee> employeeMap = new LinkedHashMap<>();
        employeeMap.put(employee1.getNumberOfObject(), employee1);
        employeeMap.put(employee2.getNumberOfObject(), employee2);
        employeeMap.put(employee3.getNumberOfObject(), employee3);
        employeeMap.put(employee4.getNumberOfObject(), employee4);
        employeeMap.put(employee5.getNumberOfObject(), employee5);
        employeeMap.put(employee6.getNumberOfObject(), employee6);

        System.out.println("------------------------List---------------------------");

        employeeList.forEach(System.out::println);

        ListIterator<Employee> iterator = employeeList.listIterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals(employee5)) {
                iterator.remove();
            } else if (iterator.previousIndex() == 4) {
                iterator.add(new Employee(107, "David Mitchell"));
            } else if (iterator.nextIndex() == 1) {
                iterator.set(new Employee(109, "Jamie XX"));
            }
        }

        System.out.println("\n-------------------Modified List----------------------");

        employeeList.forEach(System.out::println);

        System.out.println("\n-------------------------Map--------------------------");

        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            int key = entry.getKey();
            Employee value = entry.getValue();

            System.out.println("Map key: " + key + "     " + value);
        }

        Employee employee7 = new Employee(110, "Liam Gallagher");

        employeeMap.put(employee7.getNumberOfObject(), employee7);
        employeeMap.remove(6);

        System.out.println("\n-------------------Modified Map----------------------");

        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            int key = entry.getKey();
            Employee value = entry.getValue();

            System.out.println("Map key: " + key + "     " + value);
        }
    }
}
