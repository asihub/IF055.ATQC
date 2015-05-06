package ita.softserve.iilntc;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        //Here we are creating our unsorted list of workers with fixed salary.
        List <Worker> listOfFixedSalaryWorkers = new LinkedList<>();
        listOfFixedSalaryWorkers.add(new FixedSalaryWorker(1, "John", "Smith", 5000));
        listOfFixedSalaryWorkers.add(new FixedSalaryWorker(2, "Anna", "Bee", 6700));
        listOfFixedSalaryWorkers.add(new FixedSalaryWorker(3, "Anna", "Brighton", 4500));
        listOfFixedSalaryWorkers.add(new FixedSalaryWorker(4, "Bobby", "Forks", 5000));
        listOfFixedSalaryWorkers.add(new FixedSalaryWorker(5, "Jay", "Boo", 5000));
        listOfFixedSalaryWorkers.add(new FixedSalaryWorker(6, "Nessy", "Luis", 8000));
        listOfFixedSalaryWorkers.add(new FixedSalaryWorker(7, "Ginger", "Brighton", 9000));
        listOfFixedSalaryWorkers.add(new FixedSalaryWorker(8, "Lana", "Boy", 6700));
        listOfFixedSalaryWorkers.add(new FixedSalaryWorker(9, "Tomas", "Grove", 12500));
        listOfFixedSalaryWorkers.add(new FixedSalaryWorker(10, "Leo", "Plate", 9000));

        //Next step is to sort our list by monthly salary and surname.
        listOfFixedSalaryWorkers.sort(Comparator.comparing(Worker::monthlySalary)
                .thenComparing(Worker::getSurname));

        //Here we are creating our unsorted list of workers with hourly salary.
        List <Worker> listOfHourSalaryWorkers = new LinkedList<>();
        listOfHourSalaryWorkers.add(new HourSalaryWorker(1, "Anna", "Perish", 30));
        listOfHourSalaryWorkers.add(new HourSalaryWorker(2, "Susi", "Parker", 55));
        listOfHourSalaryWorkers.add(new HourSalaryWorker(3, "Peter", "Pot", 80));
        listOfHourSalaryWorkers.add(new HourSalaryWorker(4, "Ray", "Peterson", 100));
        listOfHourSalaryWorkers.add(new HourSalaryWorker(5, "Gorge", "Doi", 35));
        listOfHourSalaryWorkers.add(new HourSalaryWorker(6, "Bernard", "Donny", 55));
        listOfHourSalaryWorkers.add(new HourSalaryWorker(7, "John", "Gordon", 55));
        listOfHourSalaryWorkers.add(new HourSalaryWorker(8, "Judy", "Jory", 85));
        listOfHourSalaryWorkers.add(new HourSalaryWorker(9, "Jeremy", "Raymond", 100));
        listOfHourSalaryWorkers.add(new HourSalaryWorker(10, "Arnold", "Try", 150));

        //Next step is to sort our list by monthly salary and by surname.
        listOfHourSalaryWorkers.sort(Comparator.comparing(Worker::monthlySalary)
                .thenComparing(Worker::getSurname));

        //Here we are printing sorted list of workers who get fixed salary.
        //TODO no need for concating a string - use "\nSome text ..."
        System.out.println("\n" + "The sorted list of workers who get fixed salary:");
        FixedSalaryWorker.printListOfWorkers(listOfFixedSalaryWorkers);

        //The first 5 names from sorted list of workers who get fixed salary.
        //TODO no need for concating a string - use "\nSome text ..."
        System.out.println("\n" + "The first five names of workers who get fixed salary are:");
        FixedSalaryWorker.printPartOfListOfWorkers(listOfFixedSalaryWorkers, "name", 1, 5);

        //The last 3 ids from sorted list of workers who get fixed salary.
        System.out.println("\n" + "The last three ids of workers who get fixed salary are:");
        FixedSalaryWorker.printPartOfListOfWorkers(listOfFixedSalaryWorkers, "id", 8, 10);

        //Here we are printing sorted list of workers who get hourly salary.
        //TODO no need for concating a string - use "\nSome text ..."
        System.out.println("\n" + "The sorted list of workers who get hourly salary:");
        HourSalaryWorker.printListOfWorkers(listOfHourSalaryWorkers);

        //The first 5 names from sorted list of workers who get hourly salary.
        //TODO no need for concating a string - use "\nSome text ..."
        System.out.println("\n" + "The first five names of workers who get hourly salary are:");
        HourSalaryWorker.printPartOfListOfWorkers(listOfHourSalaryWorkers, "name", 1, 5);

        //The last 3 ids from sorted list of workers who get hourly salary.
        System.out.println("\n" + "The last three ids of workers who get hourly salary are:");
        HourSalaryWorker.printPartOfListOfWorkers(listOfHourSalaryWorkers, "id", 8, 10);

    }
}
