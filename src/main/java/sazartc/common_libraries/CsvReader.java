package sazartc.common_libraries;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Enum Singleton Class CsvReader for reaeding string data
 * from csv files
 */
public enum CsvReader {

    INSTANCE;

    public List<String[]> readFromCsv(String fileName, String delimiter) {
        List<String[]> csvList = new ArrayList<>();
        String line;

        try (BufferedReader csvFile = new BufferedReader(new FileReader(fileName))) {
            while ((line = csvFile.readLine()) != null) {
                csvList.add(line.split(delimiter));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return csvList;
    }

    public List<String> readFromCsv(String fileName) {
        List<String> csvList = new ArrayList<>();
        String line;

        try (BufferedReader csvFile = new BufferedReader(new FileReader(fileName))) {
            while ((line = csvFile.readLine()) != null) {
                csvList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return csvList;
    }

}
