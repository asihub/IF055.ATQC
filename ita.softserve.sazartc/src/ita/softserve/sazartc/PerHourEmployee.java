package ita.softserve.sazartc;

public class PerHourEmployee extends Employee {
	
	private float hourRate;
	
	PerHourEmployee(int id, String name, String surname, float hourRate) {
		super.id = id;
		super.name = name;
		super.surname = surname;
		this.hourRate = hourRate;
	}		

	@Override
	public float SalaryCalc() {
		float salary;
		salary = (float) (hourRate * 20.8 * 8);
		return salary;
	}

}
