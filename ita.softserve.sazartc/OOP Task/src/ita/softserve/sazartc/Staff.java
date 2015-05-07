package ita.softserve.sazartc;

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
    
    public static final byte PER_HOUR = 1;
    public static final byte FIXED_RATE = 2;    
    
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
     * Save employees' data to the file in root project directory 
     */
    public void saveToFile(String fileName) throws IOException {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName, false);
            for (Employee employee : employees) {
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

    /**
     * Load employees' data from the file
     * @param initType - an initialization type of employee entry. 
     * Might be "PER_HOUR" or "FIXED_RATE"
     * @param fileName - file in root project directory
     * stored data must be in the same format as initType
     */
    //public void loadEmployeesFromFile(String fileName, String initType)
    public void loadEmployeesFromFile(String fileName, byte initType)
            throws IOException {

        List<Employee> tmpEmployees = new ArrayList<Employee>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            while (true) {
                String line = reader.readLine();
                if (line == null)
                    break;

                String[] lineArr = line.split(",,,");
                
                switch (initType) {
                case 1:
                    tmpEmployees.add(new PerHourEmployee(Integer
                            .parseInt(lineArr[0]), lineArr[1], lineArr[2],
                            Double.parseDouble(lineArr[3])));
                    break;
                case 2:
                    tmpEmployees.add(new FixedRateEmployee(Integer
                            .parseInt(lineArr[0]), lineArr[1], lineArr[2],
                            Double.parseDouble(lineArr[3])));
                    break;
                default:
                    throw new IllegalArgumentException();
                }
                
//                if ("PER_HOUR".equals(initType)) {
//                    tmpEmployees.add(new PerHourEmployee(Integer
//                            .parseInt(lineArr[0]), lineArr[1], lineArr[2],
//                            Double.parseDouble(lineArr[3])));
//                } else if ("FIXED_RATE".equals(initType)) {
//                    tmpEmployees.add(new FixedRateEmployee(Integer
//                            .parseInt(lineArr[0]), lineArr[1], lineArr[2],
//                            Double.parseDouble(lineArr[3])));
//                } else
//                    throw new IllegalArgumentException();
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
