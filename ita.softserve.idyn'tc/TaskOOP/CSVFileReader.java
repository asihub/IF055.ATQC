package ita.softserve.idyntc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by Ihor Dynka on 06.05.2015.
 */
public class CSVFileReader {

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
