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
	
    //FIXED TODO Java code convention!!! FIXED
	abstract public double calculateSalary();

    //TODO Java code convention!!!
    //TODO use toString() method override
	
	@Override
	public String toString() {		
		String result = String.format("[%d] %s %s: %.2f", 
										getId(), 
										getName(), 
										getSurname(), 
										calculateSalary()); 
		return result;
	}    
    
}

