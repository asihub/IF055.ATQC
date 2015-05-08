import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {

        //Verbi gratia we have standard list of fruits & vegetables which is downloaded from Internet.
        String standardFruitsAndVegetablesList = "Orange, mandarin, grapefruit, lemon, lime, kiwi, pineapple, " +
                "pomegranate, avocado, pomelo, coconut, melon, banana, pear, peach, plum, quince, apricot, " +
                "watermelon, cherry, blueberry, apple, strawberry, grape, fig, pitaya, papaya, raspberry, " +
                "cauliflower, chive, fennel, garlic, ginger, onion, leek, mushroom, parsnip, potato, shallot, " +
                "tomato, cucumber, broccoli, eggplant, etc.";

        //We are preparing our list for next manipulations.
        standardFruitsAndVegetablesList = standardFruitsAndVegetablesList.toLowerCase();
        standardFruitsAndVegetablesList = standardFruitsAndVegetablesList.replaceAll(",", "");
        standardFruitsAndVegetablesList = standardFruitsAndVegetablesList.replace("etc.", "");

        //We do an array of fruits and vegetables to use them for objects initialization.
        String[] goodsStringList = standardFruitsAndVegetablesList.split("\\s+");

        //List block.
        //We initialize LinkedList of goods.
        List <FruitsAndVegetablesNomenclature> goodsList = new LinkedList<>();

        //Passing objects into list.
        Arrays.asList(goodsStringList)
                .forEach(fruit_n_vegetable -> goodsList
                        .add(new FruitsAndVegetablesNomenclature
                                (Arrays.asList(goodsStringList).indexOf(fruit_n_vegetable), fruit_n_vegetable)));

        //We are printing our list with "for-each" loop.
        System.out.println("Our list looks like following:");

        for (FruitsAndVegetablesNomenclature goods : goodsList) System.out.println(goods);

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
        while(it.hasNext()){
            if (goodsList.get(forIteration).lookForObjectName().equals("cucumber")) {
                it.next();
                it.remove();
            } else {
                it.next();
                forIteration++;
            }
        }

        //We wanna change objects by adding shop name - 'Good Shop'.
        for (int i=0; i < goodsList.size(); i++) {
            goodsList.get(i).changeObjectName("'Good Shop': " + goodsList.get(i).lookForObjectName() + ".");
        }

        //We are printing our list with "for-each" loop.
        System.out.println("After all changes our list looks like following:");

        for (FruitsAndVegetablesNomenclature goods : goodsList) System.out.println(goods);

        //Map block.
        //Map initialization.
        Map <Integer, FruitsAndVegetablesNomenclature> goodsMap = new ConcurrentHashMap<>();

        //We are adding our objects to map.
        for(int i=0; i < goodsStringList.length; i++){
            goodsMap.put(i, new FruitsAndVegetablesNomenclature(i, goodsStringList[i]));
        }

        //Printing map.
        System.out.println("Our map looks like following:");

        for(Map.Entry<Integer, FruitsAndVegetablesNomenclature> map : goodsMap.entrySet()) {
            System.out.println(map.getKey() + " in map---> " + map.getValue());
        }

        //Changing map.
        System.out.println("Now we are going to change our map: \n1)delete the second object; \n" +
                "2)remove melon; \n3)change name from onion to bow.");

        //Deleting object with key "2".
        Integer elementKeyForDeleting = 2;

        for (Iterator <Integer> itt = goodsMap.keySet().iterator(); itt.hasNext();) {
            if(itt.next().equals(elementKeyForDeleting)) itt.remove();
        }

        //Deleting melon.
        for(Map.Entry<Integer, FruitsAndVegetablesNomenclature> map : goodsMap.entrySet()) {
            if (map.getValue().lookForObjectName().equals("melon")) goodsMap.remove(map.getKey());
        }

        //Changing name.
        for(Map.Entry<Integer, FruitsAndVegetablesNomenclature> map : goodsMap.entrySet()) {
            if (map.getValue().lookForObjectName().equals("onion")) goodsMap.get(map.getKey()).changeObjectName("bow");
        }

        //Map after our changes.
        System.out.println("Our map after changes:");

        for(Map.Entry<Integer, FruitsAndVegetablesNomenclature> map : goodsMap.entrySet()) {
            System.out.println(map.getKey() + " in map---> " + map.getValue());
        }

    }
}

