package iilntc.task_oop;

public class Task1 {
    public static void main(String[] args) {

        int keyForIdGeneration = 1;

        Worker workersArray[] = new Worker[6];

        workersArray[0] = new HourSalaryWorker(keyForIdGeneration++, "John", "Thompson", 50.00, 22, 9);
        workersArray[1] = new HourSalaryWorker(keyForIdGeneration++, "Sarah", "Loich", 60.00);
        workersArray[2] = new HourSalaryWorker(keyForIdGeneration++, "Tomas", "Gordon", 61.00);

        workersArray[3] = new FixedSalaryWorker(keyForIdGeneration++, "Garry", "Writer", 3900.00);
        workersArray[4] = new FixedSalaryWorker(keyForIdGeneration++, "Mimi", "Lo", 5000.00);
        workersArray[5] = new FixedSalaryWorker(keyForIdGeneration++, "Moro", "Moon", 9000.00);

        for (Worker co_worker : workersArray) System.out.println(co_worker);

    }

}
