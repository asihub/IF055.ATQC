package ita.softserve.idyntc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by Ihor Dynka on 08.05.2015.
 */

public class CSVFileWriter {
    private static final String COMMA = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    private static final String FILE_HEADER = "id,firstName,lastName,salary";


    public List<Employee> writeFile(List<Employee> employeeList, String file) {
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
        return employeeList;
    }


    public List<Employee> writeFile(List<Employee> employeeList, String file, String data) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file);

            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            switch (data.toUpperCase()) {
                case "ID":
                    for (Employee employee : employeeList) {
                        fileWriter.append(String.valueOf(employee.getId()));
                        fileWriter.append(COMMA);
                        fileWriter.append(NEW_LINE_SEPARATOR);
                    }
                    break;
                case "NAME":
                    for (Employee employee : employeeList) {
                        fileWriter.append(String.valueOf(employee.getName()));
                        fileWriter.append(COMMA);
                        fileWriter.append(NEW_LINE_SEPARATOR);
                    }
                    break;
                case "SURNAME":
                    for (Employee employee : employeeList) {
                        fileWriter.append(String.valueOf(employee.getSurname()));
                        fileWriter.append(COMMA);
                        fileWriter.append(NEW_LINE_SEPARATOR);
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Wrong input parameter!!!");
            }
        } catch (IllegalArgumentException e) {
            e.getMessage();
            e.printStackTrace();
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
        return employeeList;
    }
}
