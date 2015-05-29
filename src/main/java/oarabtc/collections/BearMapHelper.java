import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class BearMapHelper {

    public static void print() {
        System.out.println("\n_________ Map bear list _________");
    }


    static Map<Integer, Bear> bears = new HashMap<Integer, Bear>();

    public static void createMapOfBears() {
        print();

        bears.put(0, new Bear("Johnny", 5));
        bears.put(1, new Bear("Mark", 2));
        bears.put(2, new Bear("Teddy", 8));
        bears.put(3, new Bear("Patric", 6));

        for (Map.Entry e : bears.entrySet()) {
            System.out.println("Mapped bears: " + " " + e.getValue());
        }
    }

    public static void setChangeOfMapBear() {

        bears.get(0).setSize(10);
        bears.get(2).setName("Ted");
        Integer elementKeyForDeleting = 3;
        for (Iterator<Integer> itt = bears.keySet().iterator(); itt.hasNext(); ) {
            if (itt.next().equals(elementKeyForDeleting)) itt.remove();
        }
        for (Map.Entry e : bears.entrySet()) {
            System.out.println("Changed mapped bears: " + " " + e.getValue());
        }
    }
}
