import java.util.Comparator;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {

        int keyForIdGenerator = 1;
        Worker coworker[] = new Worker[6];

        coworker[0] = new HourSalaryWorker(100000 + 100 * (keyForIdGenerator++), "John", "Thompson", 50.00);
        coworker[1] = new HourSalaryWorker(100000 + 100 * (keyForIdGenerator++), "Sarah", "Loich", 60.00);
        coworker[2] = new HourSalaryWorker(100000 + 100 * (keyForIdGenerator++), "Tomas", "Gordon", 61.00);

        coworker[3] = new FixedSalaryWorker(100000 + 100 * (keyForIdGenerator++), "Garry", "Writer", 3900.00);
        coworker[4] = new FixedSalaryWorker(100000 + 100 * (keyForIdGenerator++), "Mimi", "Lo", 5000.00);
        coworker[5] = new FixedSalaryWorker(100000 + 100 * (keyForIdGenerator++), "Moro", "Moon", 9000.00);

        for (Worker co_worker : coworker) System.out.println(co_worker);

    }
}