package ita.softserve.sazartc;

public class FixedRateEmployee extends Employee {
	
	private double fixedRate;

	FixedRateEmployee(int id, String name, String surname, double fixedRate) {
		super.id = id;
		super.name = name;
		super.surname = surname;
		this.fixedRate = fixedRate;
	}	
	
	@Override
    //FIXED TODO Java code convention!!! FIXED
    public double calculateSalary() {
		return this.fixedRate;
	}

}
