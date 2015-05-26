package sazartc.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> cars = createCars();
        printCarsInfo(cars);
        modifyCars(cars);
        printCarsInfo(cars);

        HashMap<String, Player> players = createPlayers();
        printPlayersInfo(players);
        modifyPlayers(players);
        printPlayersInfo(players);

    }

    // create ArrayList of cars data
    public static ArrayList<Car> createCars() {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Honda", 2007, "blue"));
        cars.add(new Car("Mazda", 2009, "red"));
        cars.add(new Car("Lanos", 2012, "blue"));
        cars.add(new Car("Hyundai", 2008, "white"));
        cars.add(new Car("Renault", 2011, "grey"));
        return cars;
    }

    // print information about cars
    public static void printCarsInfo(ArrayList<Car> cars) {
        System.out.println("---------------------------");
        System.out.println("Cars Info");
        System.out.println("---------------------------");
        for (Car car : cars) {
            System.out.println(car.toString());
        }
        System.out.println("---------------------------");
    }

    // Map - football player. Key, value - number, player accordingly
    public static HashMap<String, Player> createPlayers() {
        HashMap<String, Player> players = new HashMap<String, Player>();
        players.put("1", new Player("Yarmolenko", 85, 25));
        players.put("2", new Player("Konoplyanka", 62, 23));
        players.put("3", new Player("Bezus", 74, 23));
        players.put("4", new Player("Zozulya", 65, 24));
        players.put("5", new Player("Shevchuk", 75, 36));
        return players;
    }

    // print information about players
    public static void printPlayersInfo(HashMap<String, Player> players) {
        System.out.println("---------------------------");
        System.out.println("Players Info");
        System.out.println("---------------------------");
        Set<String> keys = players.keySet();

        for (String key : keys) {
            System.out.printf("%s: %s \n", key, players.get(key));
        }
        System.out.println("---------------------------");
    }

    // modify cars info
    public static ArrayList<Car> modifyCars(ArrayList<Car> cars) {
        cars.set(0, (new Car("Honda", 2007, "red")));
        cars.remove(1);
        return cars;
    }

    // modify players info
    public static HashMap<String, Player> modifyPlayers(HashMap<String, Player> players) {

        for (Entry<String, Player> entry : players.entrySet()) {
            if (entry.getKey().equals("1")) {
                entry.setValue(new Player("Konoplyanka", 62, 23));
            }
        }

        players.remove("4");
        return players;
    }

}
