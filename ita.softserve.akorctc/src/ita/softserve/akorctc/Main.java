package ita.softserve.akorctc;

public class Main {

          public static void main(String[] args) {

            Worker [] workers = new Worker[4];

            workers[0] = new HourlySalary(1,"Iggy","Pop", 1000);
            workers[1] = new HourlySalary(2,"Joey","Ramone", 1000);
            workers[2] = new FixedSalary(3,"Lue","Reed", 1000);
            workers[3] = new FixedSalary(4,"Robert","Plant", 1000);

            for (Worker worker : workers) worker.getWorkerInfo();

        }

    }

