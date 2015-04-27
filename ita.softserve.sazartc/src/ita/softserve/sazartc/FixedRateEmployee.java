package ita.softserve.sazartc;

public class FixedRateEmployee extends Employee {
	
	private float fixedRate;

	FixedRateEmployee(int id, String name, String surname, float fixedRate) {
		super.id = id;
		super.name = name;
		super.surname = surname;
		this.fixedRate = fixedRate;
	}	
	
	@Override
	public float SalaryCalc() {		
		return this.fixedRate;
	}

}
