package sazartc.collections.collections_classes;

import sazartc.collections.base_classes.Car;
import sazartc.collections.utility_classes.Color;
import sazartc.collections.utility_classes.CsvLoadable;
import sazartc.common_libraries.CsvReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 29.05.2015.
 */
public class Garage implements CsvLoadable {

    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addFromCsv(String csvFileName, String delimiter) {

        List<String[]> carsDataList = CsvReader.INSTANCE.readFromCsv(csvFileName, delimiter);

        for (String[] carArray: carsDataList) {
            addCar(new Car(carArray[0], Integer.valueOf(carArray[1]), Color.valueOf(carArray[2])));
        }
    }

    public void setCar(int carIndex, Car car) {
        cars.set(carIndex, car);
    }

    public void removeeCar(int carIndex) {
        cars.remove(carIndex);
    }

    @Override
    public String toString() {
        return "Cars{" + "cars=" + cars + '}';
    }
}
