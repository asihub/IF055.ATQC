package sazartc.task_oop;

import java.io.IOException;

public class Task2 {

    public static void main(String[] args) throws IOException {

        final String PER_HOUR_STAFF_FILENAME =
                "src\\main\\java\\sazartc\\task_oop\\resources\\PerHourStaff.txt";

        final String FIXED_RATE_STAFF_FILENAME =
                "src\\main\\java\\sazartc\\task_oop\\resources\\FixedRateStaff.txt";

        Staff perHourStaff = new Staff();
        perHourStaff.loadEmployeesFromFile(PER_HOUR_STAFF_FILENAME, "PER_HOUR");
        System.out.println(perHourStaff.toString());
        perHourStaff.sort();
        System.out.println(perHourStaff.toString(5));
        System.out.println(perHourStaff.toString(-3));

        Staff fixedRateStaff = new Staff();
        fixedRateStaff.loadEmployeesFromFile(FIXED_RATE_STAFF_FILENAME, "FIXED_RATE");
        System.out.println(fixedRateStaff.toString());
        fixedRateStaff.sort();
        System.out.println(fixedRateStaff.toString(5));
        System.out.println(fixedRateStaff.toString(-3));
    }

}
