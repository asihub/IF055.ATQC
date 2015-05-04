package ita.softserve.task2;

/**
 * Child Employee class described Employee with fixed salary calculated
 * on monthly wage
 */
public class FixedRateEmployee extends Employee {
	
	FixedRateEmployee(int id, String name, String surname, double salaryBase) {
		super(id, name, surname, salaryBase);
	}	
	
	@Override
    public double calculateSalary() {
		return this.salaryBase;
	}

	
}
