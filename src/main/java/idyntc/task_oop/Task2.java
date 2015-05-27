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
        String filePath = "src\\main\\java\\idyntc\\task_oop\\";
        String perHourSalaryFile = filePath + "inputData\\perHourSalaryInput.csv";
        String fixedSalaryFile = filePath + "inputData\\fixedSalaryInput.csv";

        List<Employee> perHourSalaryEmployeeList = new ArrayList<>();
        List<Employee> fixedSalaryEmployeeList = new ArrayList<>();

        CSVFileReader csvFileReader = new CSVFileReader();
        CSVFileWriter csvFileWriter = new CSVFileWriter();
        

        csvFileReader.readFromFile(perHourSalaryEmployeeList, perHourSalaryFile, "perHourSalary");

        perHourSalaryEmployeeList.sort(new EmployeesComparator());
       
        csvFileWriter.writeFile(perHourSalaryEmployeeList.subList(0, 9), filePath + "outputData/perHourSalaryOutput.csv");
        csvFileWriter.writeFile(perHourSalaryEmployeeList.subList(0, 5), filePath + "outputData/5NameOfPerHourSalaryOutput.csv");
        csvFileWriter.writeFile(perHourSalaryEmployeeList.subList(7, 10), filePath + "outputData/Last3IDofPerHourSalaryOutput.csv");
        
        csvFileReader.readFromFile(fixedSalaryEmployeeList, fixedSalaryFile, "fixedSalary");

        fixedSalaryEmployeeList.sort(new EmployeesComparator());

        csvFileWriter.writeFile(fixedSalaryEmployeeList.subList(0, 9), filePath + "outputData/fixedSalaryOutput.csv");

        csvFileWriter.writeFile(fixedSalaryEmployeeList.subList(0, 5), filePath + "outputData/5NameOfFixedSalaryOutput.csv");

        csvFileWriter.writeFile(fixedSalaryEmployeeList.subList(7, 10), filePath + "outputData/Last3IDofFixedSalaryOutput.csv");


    }

}





