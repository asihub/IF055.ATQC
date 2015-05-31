/*
* Copyright (C) 2015 TaskOOP Project by Ihor Dynka
 */
package idyntc.task_oop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * reads Employees from CSV file and sets their in arrayList
 */
public class CSVFileReader {

    /**
     * reads PerHourSalaryEmployee and FixedSalaryEmployee from CSV file and sets their in arraylist
     *
     * @param employeeList which lists you'd like to sets
     * @param file         fileName or filePath
     * @param data         gives the opportunity to choose arrayList. It maust be "perHourSalary" or "fixedSalary"
     */

    public void readFromFile(List<Employee> employeeList, String file, String data) {

        BufferedReader bufferedReader = null;
        String line = "";
        final String SPLIT_BY = ",";

        try {

            bufferedReader = new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine()) != null) {
                String[] employee = line.split(SPLIT_BY);

                switch (data.toLowerCase()) {

                    case "perhoursalary":
                        employeeList.add(new PerHourSalaryEmployee(Integer.parseInt(employee[0]), employee[1],
                                employee[2], Double.parseDouble(employee[3])));
                        break;
                    case "fixedsalary":
                        employeeList.add(new FixedSalaryEmployee(Integer.parseInt(employee[0]), employee[1],
                                employee[2], Integer.parseInt(employee[3])));
                        break;
                    default:
                        throw new IllegalArgumentException("Wrong input data");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.getMessage();
            e.printStackTrace();

        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Reading from file has already done!!!");
    }
}
