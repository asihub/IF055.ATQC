package ita.softserve.task2;

/**
 * Child Employee class described Employee with salary calculated
 * on actual worked hours
 */
public class PerHourEmployee extends Employee {
	
	final private double AVG_DAYS_COUNT = 20.8; 	// avarage count of worked days
	final private int HOURS_PER_DAY = 8;			// count of hours in worked day
	private double hourRate;
	
	PerHourEmployee(int id, String name, String surname, double hourRate) {
		super(id, name, surname);
		this.hourRate = hourRate;
	}		

	@Override
    public double calculateSalary() {
		double salary;
		salary = hourRate * AVG_DAYS_COUNT * HOURS_PER_DAY;
		return salary;
	}

	
	
}
