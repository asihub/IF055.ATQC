import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        //List block.
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

        //We are printing our list with "for-each" loop.
        System.out.println("Our list looks like following:");
        for (FruitsAndVegetablesNomenclature goods : goodsLinkedList) System.out.println(goods);

        //Doings with LinkedList.
        //Different changes in LinkedList.
        goodsLinkedList.add(new FruitsAndVegetablesNomenclature(155, "unknown fruit"));
        goodsLinkedList.add(new FruitsAndVegetablesNomenclature(1016, "unknown vegetable"));
        goodsLinkedList.add(new FruitsAndVegetablesNomenclature(1017, "unknown vegetable"));
        goodsLinkedList.add(15, new FruitsAndVegetablesNomenclature(1111, "unknown fruit"));
        System.out.println("After new objects adding list size is: " + goodsLinkedList.size() + ".");

        //Also we are going to change LinkedList with iterator.
        Iterator it = goodsLinkedList.iterator();
        int forIteration = 0;
        while(it.hasNext()){
            if (goodsLinkedList.get(forIteration).lookForObjectName().equals("cucumber")) {
                it.next();
                it.remove();
            } else {
                it.next();
                forIteration++;
            }
        }

        System.out.println("After changes with iterator list size is: " + goodsLinkedList.size() + ".");

        //We wanna change objects by adding shop name (Good Shop).
        for (int i=0; i < goodsLinkedList.size(); i++) {
            goodsLinkedList.get(i).changeObjectName("'Good Shop': " + goodsLinkedList.get(i).lookForObjectName() + ".");
        }

        //We are printing our list with "for-each" loop.
        System.out.println("After adding shop's name list looks as following:");
        for (FruitsAndVegetablesNomenclature goods : goodsLinkedList) System.out.println(goods);

        //Map block.
        //Map initialization.
        TreeMap <Integer, FruitsAndVegetablesNomenclature> goodsMap = new TreeMap<>();

        //We are adding our objects to map.
        for(int i=0; i < goodsStringList.length; i++){
            goodsMap.put(i, new FruitsAndVegetablesNomenclature(i, goodsStringList[i]));
        }

        //Printing map.
        System.out.println("Our map has " + goodsMap.size() + " elements and looks like following:");
        for(Map.Entry<Integer, FruitsAndVegetablesNomenclature> map : goodsMap.entrySet()) {
            System.out.println(map.getKey() + ":---> " + map.getValue());
        }

        //Deleting object with key "2" in map.
        Integer elementKeyForDeleting = 2;
        for (Iterator <Integer> itt = goodsMap.keySet().iterator(); itt.hasNext();) {
            if(itt.next().equals(elementKeyForDeleting)) itt.remove();
        }

        //Map after deleting the second element.
        System.out.println("We have deleted the " + elementKeyForDeleting + " element and the map looks like following:");
        for(Map.Entry<Integer, FruitsAndVegetablesNomenclature> map : goodsMap.entrySet()) {
            System.out.println(map.getKey() + ":---> " + map.getValue());
        }

    }
}

