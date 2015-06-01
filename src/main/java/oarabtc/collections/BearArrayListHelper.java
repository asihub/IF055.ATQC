package oarabtc.collections;

import java.util.ArrayList;
import java.util.List;

public class BearArrayListHelper {

    static List<Bear> bears = new ArrayList<Bear>();

    public static void createBearList() {

        bears.add(new Bear("Johnny", 5));
        bears.add(new Bear("Mark", 2));
        bears.add(new Bear("Teddy", 8));
        bears.add(new Bear("Patric", 6));
    }

    public static void printBearList() {
        System.out.println("_________  Bear ArrayList _________");

        for (Bear bear : bears) {
            System.out.println("Here are our bears: " + bear);
        }
    }

    public static void changeBearList() {

        bears.add(new Bear("Arthur", 12));
        bears.add(new Bear("Frank", 4));
        bears.set(1, new Bear("Clare", bears.get(1).getSize()));
    }

    public static void printChangedBearList() {

        for (Bear changedBear : bears) {
            System.out.println("Here are our and new bears: " + changedBear);
        }
    }
}
