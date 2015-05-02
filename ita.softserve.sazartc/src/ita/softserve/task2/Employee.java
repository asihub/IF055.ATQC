package ita.softserve.task2;

/**
 * Abstract class described Emplyee
 */
public abstract class Employee {
	
	protected int id;
	protected String name;
	protected String surname;
	
	public Employee(int id, String name, String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;		
	}
	
	abstract public double calculateSalary();

	@Override
	public String toString() {		
		return String.format("[%d] %s %s: %.2f", 
				this.id, this.name, this.surname, calculateSalary()); 
	}    
    
}

