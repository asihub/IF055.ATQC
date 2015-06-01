package oarabtc.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BearMapHelper {

    static Map<Integer, Bear> bears = new HashMap<Integer, Bear>();

    public static void createBearMap() {

        bears.put(0, new Bear("Johnny", 5));
        bears.put(1, new Bear("Mark", 2));
        bears.put(2, new Bear("Teddy", 8));
        bears.put(3, new Bear("Patric", 6));
    }

    public static void printBearMap() {
        System.out.println("\n_________ Map bear list _________");

        for (Map.Entry bears : BearMapHelper.bears.entrySet()) {
            System.out.println("Mapped bears: " + " " + bears.getValue());
        }
    }

    public static void changeBearMap() {

        bears.get(0).setSize(10);
        bears.get(2).setName("Ted");
        Integer elementKeyForDeleting = 3;
        for (Iterator<Integer> iterator = bears.keySet().iterator(); iterator.hasNext(); ) {
            if (iterator.next().equals(elementKeyForDeleting)) iterator.remove();
        }
    }

    public static void printChangedBearMap() {

        for (Map.Entry bears : BearMapHelper.bears.entrySet()) {
            System.out.println("Changed mapped bears: " + " " + bears.getValue());
        }
    }
}

