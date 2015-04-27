package ita.softserve.sazartc;

public abstract class Employee {
	
	protected int id;
	protected String name;
	protected String surname;
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return surname;
	}
    //TODO Java code convention!!!
	public abstract float SalaryCalc();

    //TODO Java code convention!!!
    //TODO use toString() method override
    public void SalaryPrint() {
		System.out.printf("[%d] %s %s: ", getId(), getName(), getSurname());	
		System.out.printf("%.2f\n", SalaryCalc());
	}
}

