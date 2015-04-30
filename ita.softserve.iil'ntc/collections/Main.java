import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Verbi gratia we have standard list of fruits & vegetables which is downloaded from Internet.
        String standardFruitsAndVegetablesList = "Cucumber, cucumber, cucumber, cucumber, tomato, cucumber, grape, broccoli, eggplant, onion, watermelon, melon, etc.";

        //We are preparing our list for next manipulations.
        standardFruitsAndVegetablesList = standardFruitsAndVegetablesList.toLowerCase();
        standardFruitsAndVegetablesList = standardFruitsAndVegetablesList.replaceAll(",", "");
        standardFruitsAndVegetablesList = standardFruitsAndVegetablesList.replace("etc.", "");

        //We do an array of fruits and vegetables to use them for objects initialization.
        String[] goodsStringList = standardFruitsAndVegetablesList.split("\\s+");

        //We initialize an array of our objects.
        FruitsAndVegetablesNomenclature[] goodsArray = new FruitsAndVegetablesNomenclature[goodsStringList.length];

        //We initialize LinkedList of goods for possibility of changes.
        LinkedList<FruitsAndVegetablesNomenclature> goodsLinkedList = new LinkedList<>();

        //Passing objects to array.
        for (int i = 0; i < goodsStringList.length; i++) {
            goodsArray[i] = new FruitsAndVegetablesNomenclature(i, goodsStringList[i]);
        }
        //Passing objects to LinkedList.
        for (int j = 0; j < goodsStringList.length; j++) {
            goodsLinkedList.add(goodsArray[j]);
        }

        //Different changes in LinkedList.
        goodsLinkedList.add(new FruitsAndVegetablesNomenclature(155, "unknown fruit"));
        goodsLinkedList.add(new FruitsAndVegetablesNomenclature(1016, "unknown vegetable"));
        goodsLinkedList.add(new FruitsAndVegetablesNomenclature(1017, "unknown vegetable"));
        goodsLinkedList.add(15, new FruitsAndVegetablesNomenclature(1111, "unknown fruit"));
        System.out.println(goodsLinkedList.size());

        Iterator it = goodsLinkedList.iterator();
        int i = 0;
        while(it.hasNext()){
            System.out.println(i++ + " " + it.next());
        }
    }
}

