package sazartc.collections;

import sazartc.collections.base_classes.Car;
import sazartc.collections.base_classes.Player;
import sazartc.collections.collections_classes.Garage;
import sazartc.collections.collections_classes.Team;
import sazartc.collections.utility_classes.Color;

public class CollectionsTest {

    public static void main(String[] args) {

        final String CARS_CSV_FILENAME = "src\\main\\java\\sazartc\\collections\\resources\\cars.csv";
        final String PLAYERS_CSV_FILENAME = "src\\main\\java\\sazartc\\collections\\resources\\players.csv";
        final String CSV_DELIMITER = "\\|";

        Garage garage = new Garage();
        garage.addFromCsv(CARS_CSV_FILENAME, CSV_DELIMITER);
        System.out.println(garage.toString());
        garage.setCar(0, new Car("Honda", 2007, Color.RED));
        garage.removeeCar(1);
        System.out.println(garage.toString());

        Team team = new Team();
        team.addFromCsv(PLAYERS_CSV_FILENAME, CSV_DELIMITER);
        System.out.println(team.toString());
        team.setPlayer("1", new Player("Svatok", 72, 20));
        team.removePlayer("4");
        System.out.println(team.toString());
    }
}
