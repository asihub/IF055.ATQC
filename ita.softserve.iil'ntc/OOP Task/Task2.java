package ita.softserve.iilntc;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        //TODO use "\n" for newline instead - FIXED
        //Here we are creating our unsorted list of workers with fixed salary.
        LinkedList <FixedSalaryWorker> listOfFixedSalaryWorker = new LinkedList<>();
        listOfFixedSalaryWorker.add(new FixedSalaryWorker(1, "John", "Smith", 5000));
        listOfFixedSalaryWorker.add(new FixedSalaryWorker(2, "Anna", "Bee", 6700));
        listOfFixedSalaryWorker.add(new FixedSalaryWorker(3, "Anna", "Brighton", 4500));
        listOfFixedSalaryWorker.add(new FixedSalaryWorker(4, "Bobby", "Forks", 5000));
        listOfFixedSalaryWorker.add(new FixedSalaryWorker(5, "Jay", "Boo", 5000));
        listOfFixedSalaryWorker.add(new FixedSalaryWorker(6, "Nessy", "Luis", 8000));
        listOfFixedSalaryWorker.add(new FixedSalaryWorker(7, "Ginger", "Brighton", 9000));
        listOfFixedSalaryWorker.add(new FixedSalaryWorker(8, "Lana", "Boy", 6700));
        listOfFixedSalaryWorker.add(new FixedSalaryWorker(9, "Tomas", "Grove", 12500));
        listOfFixedSalaryWorker.add(new FixedSalaryWorker(10, "Leo", "Plate", 9000));

        //Next step is to sort our list by monthly salary and surname.
        listOfFixedSalaryWorker.sort(Comparator.comparing(FixedSalaryWorker::monthlySalary)
                .thenComparing(FixedSalaryWorker::getSurname));

        //Here we are creating our unsorted list of workers with hourly salary.
        LinkedList <HourSalaryWorker> listOfHourSalaryWorker = new LinkedList<>();
        listOfHourSalaryWorker.add(new HourSalaryWorker(1, "Anna", "Perish", 30));
        listOfHourSalaryWorker.add(new HourSalaryWorker(2, "Susi", "Parker", 55));
        listOfHourSalaryWorker.add(new HourSalaryWorker(3, "Peter", "Pot", 80));
        listOfHourSalaryWorker.add(new HourSalaryWorker(4, "Ray", "Peterson", 100));
        listOfHourSalaryWorker.add(new HourSalaryWorker(5, "Gorge", "Doi", 35));
        listOfHourSalaryWorker.add(new HourSalaryWorker(6, "Bernard", "Donny", 55));
        listOfHourSalaryWorker.add(new HourSalaryWorker(7, "John", "Gordon", 55));
        listOfHourSalaryWorker.add(new HourSalaryWorker(8, "Judy", "Jory", 85));
        listOfHourSalaryWorker.add(new HourSalaryWorker(9, "Jeremy", "Raymond", 100));
        listOfHourSalaryWorker.add(new HourSalaryWorker(10, "Arnold", "Try", 150));

        //Next step is to sort our list by monthly salary and by surname.
        listOfHourSalaryWorker.sort(Comparator.comparing(HourSalaryWorker::monthlySalary)
                .thenComparing(HourSalaryWorker::getSurname));

        //Here we are printing sorted list of workers who get fixed salary.
        System.out.println("\n" + "The sorted list of workers who get fixed salary:");
        //TODO move out to separate print method - FIXED
        for (FixedSalaryWorker fsw : listOfFixedSalaryWorker) System.out.println(fsw);

        //TODO use "\n" for newline instead - FIXED

        //The first 5 names from sorted list of workers who get fixed salary.
        System.out.println("\n" + "The first five names of workers who get fixed salary are:");
        //TODO move out to separate print method - FIXED
        for (int i = 0; i < 5; i++) System.out.println(listOfFixedSalaryWorker.get(i).getName());

        //TODO use "\n" for newline instead - FIXED

        //The last 3 ids from sorted list of workers who get fixed salary.
        System.out.println("\n" + "The last three ids of workers who get fixed salary are:");
        //TODO move out to separate print method - FIXED
        for (int i = 7; i < 10; i++) System.out.println(listOfFixedSalaryWorker.get(i).getId());

        //TODO use "\n" for newline instead - FIXED

        //Here we are printing sorted list of workers who get hourly salary.
        System.out.println("\n" + "The sorted list of workers who get hourly salary:");
        //TODO move out to separate print method - FIXED
        for (HourSalaryWorker hsw : listOfHourSalaryWorker) System.out.println(hsw);

        //TODO use "\n" for newline instead - FIXED

        //The first 5 names from sorted list of workers who get hourly salary.
        System.out.println("\n" + "The first five names of workers who get hourly salary are:");
        //TODO move out to separate print method - FIXED
        for (int i = 0; i < 5; i++) System.out.println(listOfHourSalaryWorker.get(i).getName());

        //TODO use "\n" for newline instead - FIXED

        //The last 3 ids from sorted list of workers who get hourly salary.
        System.out.println("\n" + "The last three ids of workers who get hourly salary are:");
        //TODO move out to separate print method - FIXED.
        for (int i = 7; i < 10; i++) System.out.println(listOfHourSalaryWorker.get(i).getId());

    }
}