package ita.softserve.task2;

/**
 * Abstract class described Emplyee' properties with cached salary
 */
abstract public class Employee implements Comparable<Employee> {
	
	protected int id;
	protected String name;
	protected String surname;
	protected double salaryBase;
	
	public Employee(int id, String surname, String name, double salaryBase) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.salaryBase = salaryBase;
	}
	
	abstract public double calculateSalary();
	//abstract public double getSalaryBase();

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

