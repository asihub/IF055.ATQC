package ita.softserve.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
	
//	abstract public void loadFromFile(String fileName) throws IOException;
	
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
	
	public void saveToFile(String fileName) throws IOException {
		FileWriter writer = null;
		try {
			writer = new FileWriter(fileName, false);
			for (Employee employee: employees) {
				writer.write(String.format("%s,,,", employee.id));
				writer.write(String.format("%s,,,", employee.surname)); 
				writer.write(String.format("%s,,,", employee.name)); 
				writer.write(String.format("%f\n", employee.salaryBase));
			}
		} catch (IOException e) {
            System.out.println(e.getMessage());
	    } finally {
	    	if (writer != null) writer.close();
	    }
		
	}
	
	public void loadFromFile(String fileName, String initType) throws IOException {		
		
		List<Employee> tmpEmployees = new ArrayList<Employee>();
		BufferedReader reader = null;		
		try {
			reader = new BufferedReader(new FileReader(fileName));
			while (true) {
				String line = reader.readLine();
				if (line == null) break;

				String[] lineArr = line.split(",,,");
				
				if (initType.equals("PER_HOUR")) {
					tmpEmployees.add(new PerHourEmployee(Integer.parseInt(lineArr[0]), 
							lineArr[1], lineArr[2], Double.parseDouble(lineArr[3])));
				} else if (initType.equals("FIXED_RATE")) {
					tmpEmployees.add(new FixedRateEmployee(Integer.parseInt(lineArr[0]), 
							lineArr[1], lineArr[2], Double.parseDouble(lineArr[3])));
				} else throw new IllegalArgumentException();	
			}
			
			this.employees.clear();
			this.employees = tmpEmployees;
			
		} catch (IOException e) {
            System.out.println(e.getMessage());
	    } finally {
	    	if (reader != null) reader.close();
	    }
		
	}


}
