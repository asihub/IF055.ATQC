package ita.softserve.sazartc;

import java.io.IOException;

public class Task2 {

    public static void main(String[] args) throws IOException {

        Staff perHourStaff = new Staff();
        perHourStaff.loadFromFile("PerHourStaff.txt", "PER_HOUR");
        System.out.println(perHourStaff.toString());
        perHourStaff.sort();
        System.out.println(perHourStaff.toString(5));
        System.out.println(perHourStaff.toString(-3));

        Staff fixedRateStaff = new Staff();
        fixedRateStaff.loadFromFile("FixedRateStaff.txt", "FIXED_RATE");
        System.out.println(fixedRateStaff.toString());
        fixedRateStaff.sort();
        System.out.println(fixedRateStaff.toString(5));
        System.out.println(fixedRateStaff.toString(-3));
    }

}
