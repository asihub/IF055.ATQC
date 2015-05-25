package akorctc.task_oop;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task2 {

          public static void main(String[] args) {

              List<Worker> fixedSalaryWorker = new ArrayList<Worker>() {{
                  add(new FixedSalaryWorker(1, "Iggy","Pop", 1140));
                  add(new FixedSalaryWorker(2,"Joey","Ramone", 1250));
                  add(new FixedSalaryWorker(3,"Lue","Reed", 1750));
                  add(new FixedSalaryWorker(4,"Robert","Plant", 1700));
                  add(new FixedSalaryWorker(5, "Jonny", "Rotten", 1100));
                  add(new FixedSalaryWorker(6, "Danial", "Rave", 1150));
                  add(new FixedSalaryWorker(7, "Bill", "Grame", 1600));
                  add(new FixedSalaryWorker(8, "Ary", "Delon", 1450));
                  add(new FixedSalaryWorker(9, "Stive", "Haris", 1000));
                  add(new FixedSalaryWorker(10, "Debby", "Harry", 1100));
              }};

              List<Worker> hourlySalaryWorker = new ArrayList<Worker>() {{
                  add(new HourlySalaryWorker(1, "Dolores", "Sutton", 8.4));
                  add(new HourlySalaryWorker(2, "Shelley ", "Henry", 8.2));
                  add(new HourlySalaryWorker(3, "Erik", "Rockwood", 7.9));
                  add(new HourlySalaryWorker(4, "Willette", "Benton", 8.9));
                  add(new HourlySalaryWorker(5, "Vera", "Kidd", 6.7));
                  add(new HourlySalaryWorker(6, "Oralia", "Tressler", 8.2));
                  add(new HourlySalaryWorker(7, "Stevie", "Gilmore", 8.2));
                  add(new HourlySalaryWorker(8, "Delphine", "Byrd", 5.1));
                  add(new HourlySalaryWorker(9, "Robert", "Dixon", 9));
                  add(new HourlySalaryWorker(10, "Norman", "McRae", 7.3));
              }};

              Comparator<Worker> workerComparator;
              workerComparator = Comparator.comparing(Worker::getMonthlyIncome)
                      .thenComparing(Worker::getLastName);

              fixedSalaryWorker.sort(workerComparator);

              System.out.println("_______________________________ ");
              System.out.println("Sorted list of Workers: \n");
              Worker.printList(fixedSalaryWorker);

              System.out.println("_______________________________ ");
              System.out.println("Fixed Salary Worker (five names):");
              Worker.printFirstNames(fixedSalaryWorker, 5, "name");

              System.out.println("_______________________________ ");
              System.out.println("Fixed Salary Worker (three id's):");
              Worker.printLastId(fixedSalaryWorker, 3, "id");


          }

}

