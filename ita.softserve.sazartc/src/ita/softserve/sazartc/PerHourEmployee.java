package ita.softserve.sazartc;

public class PerHourEmployee extends Employee {
	
	private double hourRate;
	
	PerHourEmployee(int id, String name, String surname, double hourRate) {
		super.id = id;
		super.name = name;
		super.surname = surname;
		this.hourRate = hourRate;
	}		

	@Override
    //FIXED TODO Java code convention!!! FIXED
    public double calculateSalary() {
		double salary;
		salary = hourRate * 20.8 * 8;
		return salary;
	}

}
