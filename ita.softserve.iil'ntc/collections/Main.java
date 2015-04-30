import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Verbi gratia we have standard list of fruits & vegetables which is downloaded from Internet.
        String standardFruitsAndVegetablesList = "Cucumber, cucumber, cucumber, cucumber, " +
                "tomato, cucumber, grape, broccoli, " +
                "eggplant, onion, watermelon, melon, cucumber, etc.";

        //We are preparing our list for next manipulations.
        standardFruitsAndVegetablesList = standardFruitsAndVegetablesList.toLowerCase();
        standardFruitsAndVegetablesList = standardFruitsAndVegetablesList.replaceAll(",", "");
        standardFruitsAndVegetablesList = standardFruitsAndVegetablesList.replace("etc.", "");

        //We do an array of fruits and vegetables to use them for objects initialization.
        String[] goodsStringList = standardFruitsAndVegetablesList.split("\\s+");

        //We initialize LinkedList of goods.
        LinkedList<FruitsAndVegetablesNomenclature> goodsLinkedList = new LinkedList<>();

        //Passing objects to LinkedList.
        for (int i = 0; i < goodsStringList.length; i++) {
            goodsLinkedList.add(i, new FruitsAndVegetablesNomenclature(i, goodsStringList[i]));
        }
        System.out.println("At start list size is: " + goodsLinkedList.size() + ".");

        //Doings with LinkedList.
        //Different changes in LinkedList.
        goodsLinkedList.add(new FruitsAndVegetablesNomenclature(155, "unknown fruit"));
        goodsLinkedList.add(new FruitsAndVegetablesNomenclature(1016, "unknown vegetable"));
        goodsLinkedList.add(new FruitsAndVegetablesNomenclature(1017, "unknown vegetable"));
        goodsLinkedList.add(15, new FruitsAndVegetablesNomenclature(1111, "unknown fruit"));
        System.out.println("After changes list size is: " + goodsLinkedList.size() + ".");

        Iterator it = goodsLinkedList.iterator();

        //Also we are going to change LinkedList with iterator.
        int forIteration = 0;
        while(it.hasNext()){
            if (goodsLinkedList.get(forIteration).lookForObjectName().equals("cucumber")){
                it.next();
                it.remove();
            } else {
                it.next();
                forIteration++;
            }
        }

        System.out.println("Now list size is: " + goodsLinkedList.size() + ".");
        System.out.println("Our list looks as following:");

        for (int i=0; i < goodsLinkedList.size(); i++){
            System.out.println(goodsLinkedList.get(i));
        }

    }

}

