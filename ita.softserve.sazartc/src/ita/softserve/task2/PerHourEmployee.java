package ita.softserve.task2;

/**
 * Child Employee class described Employee with salary calculated
 * on actual worked hours
 */
public class PerHourEmployee extends Employee {
	
	final private double AVG_DAYS_COUNT = 20.8; 	// avarage count of worked days
	final private int HOURS_PER_DAY = 8;			// count of hours in worked day
	
	PerHourEmployee(int id, String name, String surname, double salaryBase) {
		super(id, name, surname, salaryBase);
	}		

	@Override
    public double calculateSalary() {
		double salary;
		salary = salaryBase * AVG_DAYS_COUNT * HOURS_PER_DAY;
		return salary;
	}

}
