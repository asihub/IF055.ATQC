package sazartc.task_oop;

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
    
    private List<Employee> employees = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("==================================\n");
        result.append("Employees' Salary List\n");
        result.append("==================================\n");
        for (Employee employee : this.employees) {
            result.append(employee.toString());
            result.append("\n");
        }
        result.append("==================================\n");
        return result.toString();
    }

    /**
     * Overloaded for return part of list
     * @param index - select > 0 for return first n elements
     * or select < 0 for return last n elements      
     */    
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
        for (Employee employee : this.employees.subList(fromIndex, toIndex)) {
            result.append(employee.toString());
            result.append("\n");
        }
        result.append("==================================\n");
        return result.toString();
    }

    public void sort() {
        Collections.sort(this.employees);
    }

    /**
     * Load employees' data from the file
     * @param initType - an initialization type of employee entry. 
     * Might be "PER_HOUR" or "FIXED_RATE"
     * @param fileName - file in root project directory
     * stored data must be in the same format as initType
     */
    public void loadEmployeesFromFile(String fileName, String initType)
            throws IOException {

        List<Employee> tmpEmployees = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            String[] lineArr;

            while ((line = reader.readLine()) != null) {

                lineArr = line.split(",,,");
                
                if ("PER_HOUR".equals(initType)) {
                    tmpEmployees.add(new PerHourEmployee(Integer
                            .parseInt(lineArr[0]), lineArr[1], lineArr[2],
                            Double.parseDouble(lineArr[3].replaceAll(",","."))));
                } else if ("FIXED_RATE".equals(initType)) {
                    tmpEmployees.add(new FixedRateEmployee(Integer
                            .parseInt(lineArr[0]), lineArr[1], lineArr[2],
                            Double.parseDouble(lineArr[3].replaceAll(",","."))));
                } else
                    throw new IllegalArgumentException();
            }

            this.employees.clear();
            this.employees = tmpEmployees;

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
