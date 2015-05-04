package ita.softserve.collections;

import java.util.TreeSet;

public class Car {

	private String name;
	private int year;
	private String color;
	
	private TreeSet<String> colors = new TreeSet<String>();
	
	// Set of usable colors for cars.
	private void setColors() {
		this.colors.add("black");
		this.colors.add("grey");
		this.colors.add("blue");
		this.colors.add("red");
		this.colors.add("green");
		this.colors.add("white");
	}	
	
	Car(String name, int year, String color) {
		this.setColors();
		this.name = name;
		this.year = year;
		this.setColor(color);
	}
	
	public void setColor(String color) {
		if (this.colors.contains(color)) {
			this.color = color;
		}
		else {
			throw new IllegalArgumentException();		
		}
	}

	@Override
	public String toString() {		
		return String.format("%s (%s) - %s", this.name, this.year, this.color);
	}
	
}

