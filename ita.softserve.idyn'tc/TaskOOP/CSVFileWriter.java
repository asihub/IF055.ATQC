/*
* Copyright (C) 2015 TaskOOP Project by Ihor Dynka
 */

package ita.softserve.idyntc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * writes data to CSV file
 */

public class CSVFileWriter {
    private static final String COMMA = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    private static final String FILE_HEADER = "id,firstName,lastName,salary";

    /**
     * writes EmloyeeList to CSV file
     *
     * @param employeeList which you'd like to write in file
     * @param file         fileName or filePath
     */
    public void writeFile(List<Employee> employeeList, String file) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file);

            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);

            for (Employee employee : employeeList) {
                fileWriter.append(String.valueOf(employee.getId()));
                fileWriter.append(COMMA);
                fileWriter.append(String.valueOf(employee.getName()));
                fileWriter.append(COMMA);
                fileWriter.append(String.valueOf(employee.getSurname()));
                fileWriter.append(COMMA);
                fileWriter.append(String.valueOf(employee.getSalary()));
                fileWriter.append(COMMA);
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("writing in file has already done!!!");
    }
}
