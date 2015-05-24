import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        
        List<Employees> fixedPayEmployee = new ArrayList<Employees>();

        fixedPayEmployee.add(new FixedPayEmployee(0, "Lyra", "Belacqua", 700));
        fixedPayEmployee.add(new FixedPayEmployee(1, "Roger", "Parslow", 1500));
        fixedPayEmployee.add(new FixedPayEmployee(2, "Marisa", "Coulter", 480));
        fixedPayEmployee.add(new FixedPayEmployee(3, "Iorek", "Byrnison", 600));
        fixedPayEmployee.add(new FixedPayEmployee(4, "Iofur", "Raknison", 600));
        fixedPayEmployee.add(new FixedPayEmployee(5, "Serafina", "Pekkala", 750));
        fixedPayEmployee.add(new FixedPayEmployee(6, "Lee", "Scoresby", 580));
        fixedPayEmployee.add(new FixedPayEmployee(7, "Maria", "Costa", 700));
        fixedPayEmployee.add(new FixedPayEmployee(8, "John", "Faa", 390));
        fixedPayEmployee.add(new FixedPayEmployee(9, "Farder", "Coram", 1200));

        Collections.sort(fixedPayEmployee,
                Comparator.comparing((Employees e1) -> e1.payCalc())
                        .thenComparing(e1 -> e1.getSurname())
        );

        System.out.println("___ Sorted fixed pay employee list ____");

        FixedPayEmployee.printEmployeeList(fixedPayEmployee);

        System.out.println("\n___ 5 first fixed pay employee list ____");

        FixedPayEmployee.printRangeFromListEmployee(fixedPayEmployee, 0, 5, "Name");
        System.out.println("\n___ 3 last fixed pay employee list ____");

        FixedPayEmployee.printRangeFromListEmployee(fixedPayEmployee, 7, 10, "Name");

        
        List<Employees> hourlyPayEmployee = new ArrayList<Employees>();

        hourlyPayEmployee.add(new HourlyPayEmployee(0, "Anakin", "Skywalker", 9.1));
        hourlyPayEmployee.add(new HourlyPayEmployee(1, "QuiGon", "Jinn", 4.1));
        hourlyPayEmployee.add(new HourlyPayEmployee(2, "Padme", "Amidala", 7.0));
        hourlyPayEmployee.add(new HourlyPayEmployee(3, "Jedi", "Master", 15.7));
        hourlyPayEmployee.add(new HourlyPayEmployee(4, "ObiWan", "Kenobi", 9.1));
        hourlyPayEmployee.add(new HourlyPayEmployee(5, "Sidious", "Darth", 8.2));
        hourlyPayEmployee.add(new HourlyPayEmployee(6, "Nute", "Gunray", 5.1));
        hourlyPayEmployee.add(new HourlyPayEmployee(7, "Capt", "Panaka", 5.1));
        hourlyPayEmployee.add(new HourlyPayEmployee(8, "Mace", "Windu", 7.7));
        hourlyPayEmployee.add(new HourlyPayEmployee(9, "Gungan", "Binks", 6.8));

        Collections.sort(hourlyPayEmployee,
                Comparator.comparing((Employees e1) -> e1.payCalc())
                        .thenComparing(e1 -> e1.getSurname())
        );

        System.out.println("\n___ Sorted hour pay employee list ____");

        HourlyPayEmployee.printEmployeeList(hourlyPayEmployee);

        System.out.println("\n___ 5 first hour pay employee list ____");

        HourlyPayEmployee.printRangeFromListEmployee(hourlyPayEmployee, 0, 5, "Name");

        System.out.println("\n___ 3 last hour pay employee list ____");

        HourlyPayEmployee.printRangeFromListEmployee(hourlyPayEmployee, 7, 10, "Name");
    }
}