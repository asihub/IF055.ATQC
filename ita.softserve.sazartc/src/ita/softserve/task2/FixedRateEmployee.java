package ita.softserve.task2;

/**
 * Child Employee class described Employee with fixed salary calculated
 * on monthly wage
 */
public class FixedRateEmployee extends Employee {
	
	private double fixedRate;

	FixedRateEmployee(int id, String name, String surname, double fixedRate) {
		super(id, name, surname);
		this.fixedRate = fixedRate;
	}	
	
	@Override
    public double calculateSalary() {
		return this.fixedRate;
	}

}
