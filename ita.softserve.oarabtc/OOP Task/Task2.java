import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task2 {

    public static void main(String[] args) {
        //TODO use more generic references type - List instead of any list implementation
        ArrayList<Employees> fixedPayEmployee = new ArrayList<Employees>();

        fixedPayEmployee.add(new FixedPayEmployee(1, "Lyra", "Belacqua", 700));
        fixedPayEmployee.add(new FixedPayEmployee(2, "Roger", "Parslow", 1500));
        fixedPayEmployee.add(new FixedPayEmployee(3, "Marisa", "Coulter", 480));
        fixedPayEmployee.add(new FixedPayEmployee(4, "Iorek", "Byrnison", 600));
        fixedPayEmployee.add(new FixedPayEmployee(5, "Iofur", "Raknison", 600));
        fixedPayEmployee.add(new FixedPayEmployee(6, "Serafina", "Pekkala", 750));
        fixedPayEmployee.add(new FixedPayEmployee(7, "Lee", "Scoresby", 580));
        fixedPayEmployee.add(new FixedPayEmployee(8, "Maria", "Costa", 700));
        fixedPayEmployee.add(new FixedPayEmployee(9, "John", "Faa", 390));
        fixedPayEmployee.add(new FixedPayEmployee(10, "Farder", "Coram", 1200));

        Collections.sort(fixedPayEmployee,
                Comparator.comparing((Employees e1) -> e1.payCalc())
                        .thenComparing(e1 -> e1.getSurname())
        );

        System.out.println("___ Sorted fixed pay employee list ____");

        FixedPayEmployee.printEmployeeList(fixedPayEmployee);

        System.out.println("\n___ 5 first fixed pay employee list ____");

        FixedPayEmployee.printFirstEmployeeList(fixedPayEmployee, 5, "Name");

        System.out.println("\n___ 3 last fixed pay employee list ____");

        FixedPayEmployee.printLastEmployeeList(fixedPayEmployee, 3, "Name");

        //TODO use more generic references type - List instead of any list implementation
        ArrayList<Employees> hourlyPayEmployee = new ArrayList<Employees>();

        hourlyPayEmployee.add(new HourlyPayEmployee(1, "Anakin", "Skywalker", 9.1));
        hourlyPayEmployee.add(new HourlyPayEmployee(2, "QuiGon", "Jinn", 4.1));
        hourlyPayEmployee.add(new HourlyPayEmployee(3, "Padme", "Amidala", 7.0));
        hourlyPayEmployee.add(new HourlyPayEmployee(4, "Jedi", "Master", 15.7));
        hourlyPayEmployee.add(new HourlyPayEmployee(5, "ObiWan", "Kenobi", 9.1));
        hourlyPayEmployee.add(new HourlyPayEmployee(6, "Sidious", "Darth", 8.2));
        hourlyPayEmployee.add(new HourlyPayEmployee(7, "Nute", "Gunray", 5.1));
        hourlyPayEmployee.add(new HourlyPayEmployee(8, "Capt", "Panaka", 5.1));
        hourlyPayEmployee.add(new HourlyPayEmployee(9, "Mace", "Windu", 7.7));
        hourlyPayEmployee.add(new HourlyPayEmployee(10, "Gungan", "Binks", 6.8));

        Collections.sort(hourlyPayEmployee,
                Comparator.comparing((Employees e1) -> e1.payCalc())
                        .thenComparing(e1 -> e1.getSurname())
        );

        System.out.println("\n___ Sorted hour pay employee list ____");

        HourlyPayEmployee.printEmployeeList(hourlyPayEmployee);

        System.out.println("\n___ 5 first hour pay employee list ____");

        //TODO create a separate method for printing employees - FIXED
        HourlyPayEmployee.printFirstEmployeeList(hourlyPayEmployee, 5, "Name");

        System.out.println("\n___ 3 last hour pay employee list ____");

        HourlyPayEmployee.printLastEmployeeList(hourlyPayEmployee, 3, "Name");
    }
}