package ita.softserve.sazartc;

public class FixedTaxEmployee extends Employee {
	
	private float fixedTax;

	FixedTaxEmployee(int id, String name, String surname, float fixedTax) {
		super.id = id;
		super.name = name;
		super.surname = surname;
		this.fixedTax = fixedTax;
	}	
	
	@Override
	public float SalaryCalc() {		
		return this.fixedTax;
	}

}
