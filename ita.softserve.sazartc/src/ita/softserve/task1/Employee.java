package ita.softserve.task1;

public abstract class Employee {
	
	protected int id;
	protected String name;
	protected String surname;
	
    //FIXED TODO Java code convention!!! FIXED
	abstract public double calculateSalary();

    //FIXED TODO Java code convention!!! FIXED
    //FIXED TODO use toString() method override FIXED
	
	@Override
	public String toString() {		
		String result = String.format("[%d] %s %s: %.2f", 
			this.id, this.name, this.surname, calculateSalary()); 
		return result;
	}    
    
}

