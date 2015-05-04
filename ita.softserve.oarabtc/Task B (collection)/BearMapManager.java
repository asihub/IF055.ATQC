import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Olia on 03.05.2015.
 */
public class BearMapManager {

    public void print() {System.out.println("_________ Map bear list _________");}

    public BearMapManager() {
        print();

        Map<Integer, Bear> bears = new HashMap<Integer, Bear>();

        bears.put(0, new Bear("Johnny", 5));
        bears.put(1, new Bear("Mark", 2));
        bears.put(2, new Bear("Teddy", 8));
        bears.put(3, new Bear("Patric", 6));

        for (Map.Entry e : bears.entrySet()) {
            System.out.println("Mapped bears: " + " " + e.getValue());
        }

        System.out.println();

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
