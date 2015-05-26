package iilntc.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class CollectionsTask {
    public static void main(String[] args) {

        //Verbi gratia we have standard list of fruits & vegetables which is downloaded from Internet.
        String standardFruitsAndVegetablesList = "Orange, mandarin, grapefruit, lemon, lime, kiwi, pineapple, " +
                "pomegranate, avocado, pomelo, coconut, melon, banana, pear, peach, plum, quince, apricot, " +
                "watermelon, cherry, blueberry, apple, strawberry, grape, fig, pitaya, papaya, raspberry, " +
                "cauliflower, chive, fennel, garlic, ginger, onion, leek, mushroom, parsnip, potato, shallot, " +
                "tomato, cucumber, broccoli, eggplant, etc.";

        //We are preparing our list for next manipulations.
        //TODO method chaining?
        standardFruitsAndVegetablesList = standardFruitsAndVegetablesList.toLowerCase();
        standardFruitsAndVegetablesList = standardFruitsAndVegetablesList.replaceAll(",", "");
        standardFruitsAndVegetablesList = standardFruitsAndVegetablesList.replace("etc.", "");

        //We do an array of fruits and vegetables to use them for objects initialization.
        String[] goodsStringList = standardFruitsAndVegetablesList.split("\\s+");

        //List block.
        //We initialize LinkedList of goods.
        List<FruitsAndVegetablesNomenclature> goodsList = new LinkedList<>();

        //Passing objects into list.
        Stream.of(goodsStringList).forEach(n -> goodsList.add
                (new FruitsAndVegetablesNomenclature(Arrays.asList(goodsStringList).indexOf(n), n)));

        //We are printing our list with "for-each" loop.
        System.out.println("Our list looks like following:");

        goodsList.forEach(System.out::println);

        //Doings with list.
        //Different changes in list.
        System.out.println("Now we are going to change our list: \n1)add few objects; \n" +
                "2)remove cucumber; \n3)add shop's name - 'Good Shop'.");

        //Adding element.
        goodsList.add(new FruitsAndVegetablesNomenclature(1016, "unknown vegetable"));
        goodsList.add(15, new FruitsAndVegetablesNomenclature(1111, "unknown fruit"));

        //Also we are going to change list with iterator.
        Iterator it = goodsList.iterator();
        int forIteration = 0;
        while (it.hasNext()) {
            if (goodsList.get(forIteration).lookForObjectName().equals("cucumber")) {
                it.next();
                it.remove();
            } else {
                it.next();
                forIteration++;
            }
        }

        //We wanna change objects by adding shop name - 'Good Shop'.
        goodsList.forEach(n -> n.changeObjectName("'Good Shop': " + n.lookForObjectName() + "."));

        //We are printing our list with "for-each" loop.
        System.out.println("After all changes our list looks like following:");

        goodsList.forEach(System.out::println);

        //Map block.
        //Map initialization.
        Map<Integer, FruitsAndVegetablesNomenclature> goodsMap = new ConcurrentHashMap<>();

        //We are adding our objects to map.
        Stream.of(goodsStringList).forEach(n -> goodsMap.put
                (Arrays.asList(goodsStringList).indexOf(n),
                        new FruitsAndVegetablesNomenclature(Arrays.asList(goodsStringList).indexOf(n), n)));

        //Printing map.
        System.out.println("Our map looks like following:");

        goodsMap.forEach((key, value) -> System.out.println(key + " in map---> " + value));

        //Changing map.
        System.out.println("Now we are going to change our map: \n1)delete the second object; \n" +
                "2)remove melon; \n3)change name from onion to bow.");

        //Deleting object with key "2".
        goodsMap.forEach((key, value) -> {
            if (key == 2) goodsMap.remove(key);
        });

        //Deleting melon.
        goodsMap.forEach((key, value) -> {
            if (value.lookForObjectName().equals("melon")) goodsMap.remove(key);
        });

        //Changing name.
        goodsMap.forEach((key, value) -> {
            if (value.lookForObjectName().equals("onion")) value.changeObjectName("bow");
        });

        //Map after our changes.
        System.out.println("Our map after changes:");

        goodsMap.forEach((key, value) -> System.out.println(key + " in map---> " + value));

    }
}

