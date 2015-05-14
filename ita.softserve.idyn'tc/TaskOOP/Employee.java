/*
* Copyright (C) 2015 TaskOOP Project by Ihor Dynka
 */

package ita.softserve.idyntc;

import java.util.List;

/**
 * initializes new employee and print their console
 */
public abstract class Employee {

    private final int id;
    private final String name;
    private final String surname;

    public Employee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    /**
     * this method gets the employee from arraylist and outputs their in console
     *
     * @param list       choose the list which you'd like
     * @param firstIndex output from first index of list
     * @param lastIndex  output to lastIndex of this list
     * @param data       kind of data, for example: ID, Name or Surname
     */

    public static void printEmployeeFromRange(List<Employee> list, int firstIndex, int lastIndex, String data) {
        try {
            CSVFileWriter csvFileWriter = new CSVFileWriter();

            switch (data.toUpperCase()) {
                case "ID":
                    for (int i = firstIndex; i <= lastIndex; i++) {
                        System.out.println(list.get(i).id);
                    }
                    break;
                case "NAME":
                    for (int i = firstIndex; i <= lastIndex; i++) {
                        System.out.println(list.get(i).name);
                    }
                    break;
                case "SURNAME":
                    for (int i = firstIndex; i <= lastIndex; i++) {
                        System.out.println(list.get(i).surname);
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }

        } catch (IllegalArgumentException e) {
            System.out.println("wrong input parameter");
        }

    }

    /**
     * this method gets the employees from arraylist and outputs their in console
     *
     * @param list       choose the list which you'd like
     * @param firstIndex output from first index of lis
     * @param lastIndex  output to lastIndex of this list
     */

    public static void printEmployeeFromRange(List<Employee> list, int firstIndex, int lastIndex) {

        for (int i = firstIndex; i <= lastIndex; i++) {
            System.out.println(list.get(i));
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract double getSalary();

    /**
     * this method helps to print employees info more correctly
     *
     * @return employees information
     */
    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary='" + getSalary() + '\'' +
                '}';
    }

}
