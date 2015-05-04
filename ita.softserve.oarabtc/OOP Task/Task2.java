/**
 * Created by Olia on 03.05.2015.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("___ Unsorted fixed pay employee list ____");

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
        fixedPayEmployee.sort(
                Comparator.comparing((Employees e1) -> e1.payCalc())
                        .thenComparing(e1 -> e1.getSurname())
        );

        System.out.println("\n" + "___ Sorted fixed pay employee list ____");
        for (Employees emp : fixedPayEmployee) {
            System.out.println(emp);
        }

        System.out.println("\n" + "___ 5 first fixed pay employee list ____");
        for (int i = 0; i < 5; i++) System.out.println(fixedPayEmployee.get(i).getName());

        System.out.println("\n" + "___ 3 last fixed pay employee list ____");
        for (int i = 7; i < 10; i++) System.out.println(fixedPayEmployee.get(i).getName());


        System.out.println("\n" + "____ Unsorted hour pay employee list ____");

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
        hourlyPayEmployee.sort(
                Comparator.comparing((Employees e1) -> e1.payCalc())
                        .thenComparing(e1 -> e1.getSurname())
        );

        System.out.println("\n" + "___ Sorted hour pay employee list ____");
        for (Employees emp : hourlyPayEmployee) {
            System.out.println(emp);
        }

        System.out.println("\n" + "___ 5 first hour pay employee list ____");
        for (int i = 0; i < 5; i++) System.out.println(hourlyPayEmployee.get(i).getName());

        System.out.println("\n" + "___ 3 last hour pay employee list ____");
        for (int i = 7; i < 10; i++) System.out.println(hourlyPayEmployee.get(i).getName());
    }
}