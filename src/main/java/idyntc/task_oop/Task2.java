/*
* Copyright (C) 2015 TaskOOP Project by Ihor Dynka
 */

package idyntc.task_oop;


import java.util.ArrayList;
import java.util.List;

/**
 * reads PerHourSalary Employee and FixedSalaryEmployee from CSV file to perHourSalaryEmployeeList and
 * fixedSalaryEmployeeList
 * <p/>
 * sorted these lists by name and salary
 * <p/>
 * writes results in CSV files
 */
public class Task2 {
    public static void main(String[] args) {
        String filePath = "src\\main\\resources\\";
        String perHourSalaryFile = filePath + "inputData\\perHourSalaryInput.csv";
        String fixedSalaryFile = filePath + "inputData\\fixedSalaryInput.csv";

        List<Employee> perHourSalaryEmployeeList = new ArrayList<>();
        List<Employee> fixedSalaryEmployeeList = new ArrayList<>();

        CSVFileReader csvFileReader = new CSVFileReader();
        CSVFileWriter csvFileWriter = new CSVFileWriter();

// reading from file
        csvFileReader.readFromFile(perHourSalaryEmployeeList, perHourSalaryFile, "perHourSalary");
// sorting this list
        perHourSalaryEmployeeList.sort(new EmployeesComparator());
// writing in console and file sorted perHourSalaryList
        Employee.printEmployeeFromRange(perHourSalaryEmployeeList, 0, 9);
        csvFileWriter.writeFile(perHourSalaryEmployeeList.subList(0, 9), filePath + "outputData/perHourSalaryOutput.csv");
// writing in console and file from 0th to 4th names from sorted perHourSalaryList
        Employee.printEmployeeFromRange(perHourSalaryEmployeeList, 0, 4, "name");
        csvFileWriter.writeFile(perHourSalaryEmployeeList.subList(0, 5), filePath + "outputData/5NameOfPerHourSalaryOutput.csv");
// writing in console and file from 7th to 9th elements from sorted perHourSalaryList
        Employee.printEmployeeFromRange(perHourSalaryEmployeeList, 7, 9, "id");
        csvFileWriter.writeFile(perHourSalaryEmployeeList.subList(7, 10), filePath + "outputData/Last3IDofPerHourSalaryOutput.csv");

// reading from file
        csvFileReader.readFromFile(fixedSalaryEmployeeList, fixedSalaryFile, "fixedSalary");
// sorting this list
        fixedSalaryEmployeeList.sort(new EmployeesComparator());
// writing in console and file sorted fixedSalaryList
        Employee.printEmployeeFromRange(fixedSalaryEmployeeList, 0, 9);
        csvFileWriter.writeFile(fixedSalaryEmployeeList.subList(0, 9), filePath + "outputData/fixedSalaryOutput.csv");
// writing in console and file from 0th to 4th names from sorted fixedSalaryList
        Employee.printEmployeeFromRange(fixedSalaryEmployeeList, 0, 4, "name");
        csvFileWriter.writeFile(fixedSalaryEmployeeList.subList(0, 5), filePath + "outputData/5NameOfFixedSalaryOutput.csv");
// writing in console and file from 7th to 9th elements from sorted fixedSalaryList
        Employee.printEmployeeFromRange(fixedSalaryEmployeeList, 7, 9, "id");
        csvFileWriter.writeFile(fixedSalaryEmployeeList.subList(7, 10), filePath + "outputData/Last3IDofFixedSalaryOutput.csv");


    }

}





