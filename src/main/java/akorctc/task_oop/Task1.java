package akorctc.task_oop;

public class Task1 {

          public static void main(String[] args) {

            Worker [] workers = new Worker[4];

            workers[0] = new HourlySalaryWorker(1,"Iggy","Pop", 1000);
            workers[1] = new HourlySalaryWorker(2,"Joey","Ramone", 1000);
            workers[2] = new FixedSalaryWorker(3,"Lue","Reed", 1000);
            workers[3] = new FixedSalaryWorker(4,"Robert","Plant", 1000);

            for (Worker worker : workers) worker.getWorkerInfo();

        }

    }

