package ita.softserve.collections;

public class Player {

	private String name;
	private double weight;
	private int age;
	
	public Player(String name, double weight, int age) {
		this.name = name;
		this.weight = weight;
		this.age = age;
	}

	@Override
	public String toString() {		
		return String.format("%s, %s, %s", this.name, this.weight, this.age);
	}
	
}
