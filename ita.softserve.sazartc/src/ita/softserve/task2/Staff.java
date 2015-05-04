package ita.softserve.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A catalog of Employees' data
 */
public class Staff {
	
	private List<Employee> employees = new ArrayList<Employee>();
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("==================================\n");
		result.append("Employees' Salary List\n");
		result.append("==================================\n");
		for (Employee employee: this.employees) {
			result.append(employee.toString()); 
			result.append("\n");
		}
		result.append("==================================\n");
		return result.toString();
	}
	
	public String toString(int index) {
		int fromIndex;
		int toIndex;
		String title;
		
		if (index > 0) {
			fromIndex = 0;
			toIndex = index;
			title = String.format("First %d", index);
		} else if (index < 0) {
			fromIndex = this.employees.size() + index;
			toIndex = this.employees.size();
			title = String.format("Last %d", index * (-1));
		} else {
			throw new IllegalArgumentException();
		}
		
		StringBuilder result = new StringBuilder();
		result.append("==================================\n");
		result.append(String.format("Employees' Salary List (%s)\n", title));
		result.append("==================================\n");
		for (Employee employee: this.employees.subList(fromIndex, toIndex)) {
			result.append(employee.toString()); 
			result.append("\n");
		}
		result.append("==================================\n");		
		return result.toString();
	}

	public void sort() {
		Collections.sort(this.employees);
	}
	


}
