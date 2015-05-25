package oarabtc.collections;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Olia on 03.05.2015.
 */

//TODO rename
public class BearManager {

    public void print() {System.out.println("_________  Bear list _________");}
    //TODO rename
    private void bearView(Bear bigBear){

            System.out.println("Here are our bears: " + bigBear);
    }

    private void bearViewChange(Bear bigBearChange) {

        System.out.println("Here are our and new bears: " + bigBearChange);
    }
    //TODO refactor
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
        bears.set(1,new Bear("Clare", bears.get(1).getSize()));

        for (Bear bigBearChange : bears) {
            bearViewChange(bigBearChange);
        }

    }


}
