import java.util.ArrayList;
import java.util.List;


public class BearArrayListHelper {

    public static void print() {
        System.out.println("_________  Bear ArrayList _________");
    }

    public static void createArrayListOfBears() {
        print();
        List<Bear> bears = new ArrayList<Bear>();
        bears.add(new Bear("Johnny", 5));
        bears.add(new Bear("Mark", 2));
        bears.add(new Bear("Teddy", 8));
        bears.add(new Bear("Patric", 6));

        for (Bear bear : bears) {
            printBearList(bear);
        }
    }

    private static void printBearList(Bear bear) {

        System.out.println("Here are our bears: " + bear);
    }

    public static void setChangeOfBears() {

        List<Bear> bears = new ArrayList<Bear>();
        bears.add(new Bear("Arthur", 12));
        bears.add(new Bear("Frank", 4));
        bears.set(1, new Bear("Clare", bears.get(1).getSize()));

        for (Bear changedBear : bears) {
            printChangeBearList(changedBear);
        }
    }

    private static void printChangeBearList(Bear changedBear) {

        System.out.println("Here are our and new bears: " + changedBear);
    }
}
