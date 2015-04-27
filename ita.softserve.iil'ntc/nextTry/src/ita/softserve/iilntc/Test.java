package ita.softserve.iilntc;
import java.io.*;
public class Test {
    public static void main(String[] args) {
        int z = 1;
        WorkerStudy[] coworker = new WorkerStudy[6];

        coworker[0] = new TypeOfWorkerStudy(100000 + 100 * (z++), "John", "Thompson", 50.00, "hr");
        coworker[1] = new TypeOfWorkerStudy(100000 + 100 * (z++), "Sarah", "Loich", 60.00, "hr");
        coworker[2] = new TypeOfWorkerStudy(100000 + 100 * (z++), "Tomas", "Gordon", 61.00, "hr");

        coworker[3] = new TypeOfWorkerStudy(100000 + 100 * (z++), "Garry", "Writer", 3900.00, "fd");
        coworker[4] = new TypeOfWorkerStudy(100000 + 100 * (z++), "Mimi", "Lo", 5000.00, "fd");
        coworker[5] = new TypeOfWorkerStudy(100000 + 100 * (z++), "Moro", "Moon", 9000.00, "fd");
        File file = new File("c:\\coworkers.txt");
        try (FileWriter writer = new FileWriter(file)) {
            for(int x = 0; x < coworker.length; x++){
            String text = coworker[x].getWorkerInformation();
            writer.write(text + "\r\n");
            System.out.println(coworker[x].getWorkerInformation());
            }
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}