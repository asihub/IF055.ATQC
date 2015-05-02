package ita.softserve.task2;

/**
 * Child Employee class described Employee with salary calculated
 * on actual worked hours
 */
public class PerHourEmployee extends Employee {
	
	private double hourRate;
	
	PerHourEmployee(int id, String name, String surname, double hourRate) {
		super(id, name, surname);
		this.hourRate = hourRate;
	}		

	@Override
    public double calculateSalary() {
		double salary;
		salary = hourRate * 20.8 * 8;
		return salary;
	}

}
