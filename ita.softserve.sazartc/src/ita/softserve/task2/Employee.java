package ita.softserve.task2;

/**
 * Abstract class described Emplyee' properties
 */
public abstract class Employee implements Comparable<Employee> {
	
	protected int id;
	protected String name;
	protected String surname;
	
	public Employee(int id, String surname, String name) {
		this.id = id;
		this.name = name;
		this.surname = surname;		
	}
	
	abstract public double calculateSalary();

	@Override
	public String toString() {		
		return String.format("[%d] %s %s: %.2f", 
				this.id, this.surname, this.name, calculateSalary()); 
	}

	@Override
	public int compareTo(Employee employee) {
		if (this.calculateSalary() < employee.calculateSalary()) {
			return -1;
		} else if (this.calculateSalary() > employee.calculateSalary()) {
			return 1;
		} else {
			if (this.surname.compareTo(employee.surname) < 0) {
				return -1;
			} else if (this.surname.compareTo(employee.surname) > 0) {
				return 1;
			} else {
				return 0;
			}
		}
	}
	
   
	
}

