import java.util.ArrayList;
import java.util.List;
/**
 * Created by Olia on 03.05.2015.
 */

public class BearManager {

    public void print() {System.out.println("_________  Bear list _________");}

  private void bearView(Bear bigBear){

            System.out.println("Here are our bears: " + bigBear);
    }

    private void bearViewChange(Bear bigBearChange) {

        System.out.println("Here are our and new bears: " + bigBearChange);
    }

    public BearManager() {
        print();
        List<Bear> bears = new ArrayList<Bear>();
        bears.add(new Bear("Johnny", 5));
        bears.add(new Bear("Mark", 2));
        bears.add(new Bear("Teddy", 8));
        bears.add(new Bear("Patric", 6));

        for (Bear bigBear : bears) {
            bearView(bigBear);
        }

        System.out.println();

        bears.add(new Bear("Arthur", 12));
        bears.add(new Bear("Frank", 4));

        for (Bear bigBearChange : bears) {
            bearViewChange(bigBearChange);
        }

    }


}
