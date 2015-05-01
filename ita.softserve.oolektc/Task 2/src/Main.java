import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> fixedWageEmployees = new ArrayList<Employee>() {{
            add(new FixedWageEmployee(1, "Bruce", "Allen", 350));
            add(new FixedWageEmployee(2, "Jessica", "Flores", 255));
            add(new FixedWageEmployee(3, "Laurena", "Alf", 150));
            add(new FixedWageEmployee(4, "Louise", "Lenox", 278));
            add(new FixedWageEmployee(5, "Agnes", "Alannis", 480));
            add(new FixedWageEmployee(6, "Bessie", "Gibson", 350));
            add(new FixedWageEmployee(7, "James", "Ortiz", 412));
            add(new FixedWageEmployee(8, "Ruby", "Hall", 300));
            add(new FixedWageEmployee(9, "Beverley", "Burke", 125));
            add(new FixedWageEmployee(10, "Earl", "Balters", 350));
        }};

        List<Employee> hourlyWageEmployees = new ArrayList<Employee>() {{
            add(new HourlyWageEmployee(1, "Dolores", "Sutton", 8.4));
            add(new HourlyWageEmployee(2, "Shelley ", "Henry", 8.2));
            add(new HourlyWageEmployee(3, "Erik", "Rockwood", 7.9));
            add(new HourlyWageEmployee(4, "Willette", "Benton", 8.9));
            add(new HourlyWageEmployee(5, "Vera", "Kidd", 6.7));
            add(new HourlyWageEmployee(6, "Oralia", "Tressler", 8.2));
            add(new HourlyWageEmployee(7, "Stevie", "Gilmore", 8.2));
            add(new HourlyWageEmployee(8, "Delphine", "Byrd", 5.1));
            add(new HourlyWageEmployee(9, "Robert", "Dixon", 9));
            add(new HourlyWageEmployee(10, "Norman", "McRae", 7.3));
        }};

        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getMonthlyWage)
                .thenComparing(Employee::getLastName);

        System.out.println("Fixed wage employee list:");
        fixedWageEmployees.forEach(System.out::println);

        System.out.println();
        System.out.println("Sorted fixed wage employee list:");
        fixedWageEmployees.sort(employeeComparator);
        fixedWageEmployees.forEach(System.out::println);

        System.out.println();
        fixedWageEmployees.subList(0, 5).forEach(n -> System.out.println(n.getFirstName()));
        fixedWageEmployees.subList(fixedWageEmployees.size() - 3, fixedWageEmployees.size())
                .forEach(n -> System.out.println(n.getId()));

        System.out.println();
        System.out.println("Hourly wage employee list:");
        hourlyWageEmployees.forEach(System.out::println);

        System.out.println();
        System.out.println("Sorted hourly wage employee list:");
        hourlyWageEmployees.sort(employeeComparator);
        hourlyWageEmployees.forEach(System.out::println);

        System.out.println();

        hourlyWageEmployees.subList(0, 5).forEach(n -> System.out.println(n.getFirstName()));
        hourlyWageEmployees.subList(hourlyWageEmployees.size() - 3, hourlyWageEmployees.size())
                .forEach(n -> System.out.println(n.getId()));
    }
}
