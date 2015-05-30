package sazartc.collections.base_classes;

import sazartc.collections.utility_classes.Color;

public class Car {

    private String name;
    private int year;
    private Color color;

    public Car(String name, int year, Color color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %s", name, year, color);
    }

}

