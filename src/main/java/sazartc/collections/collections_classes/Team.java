package sazartc.collections.collections_classes;

import java.util.Map.Entry;
import sazartc.collections.base_classes.Player;
import sazartc.collections.utility_classes.CsvLoadable;
import sazartc.common_libraries.CsvReader;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Created on 29.05.2015.
 */
public class Team implements CsvLoadable {

    private Map<String, Player> players = new HashMap<>();

    public void addPlayer(String playerNumber, Player player) {
        players.put(playerNumber, player);
    }

    public void addFromCsv(String csvFileName, String delimiter) {
        List<String[]> playersDataList = CsvReader.INSTANCE.readFromCsv(csvFileName, delimiter);

        for (String[] carArray: playersDataList) {
            addPlayer(carArray[0], new Player(carArray[1],
                    Integer.valueOf(carArray[2]), Integer.valueOf(carArray[3])));
        }
    }

    public void setPlayer(String playerNumber, Player player) {
        for (Entry<String, Player> entry : players.entrySet()) {
            if (playerNumber.equals(entry.getKey())) {
                entry.setValue(player);
            }
        }
    }

    public void removePlayer(String playerNumber) {
        players.remove(playerNumber);
    }

    @Override
    public String toString() {
        return "Players{" + "players=" + players + '}';
    }
}
