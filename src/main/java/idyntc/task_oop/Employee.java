/*
* Copyright (C) 2015 TaskOOP Project by Ihor Dynka
 */

package idyntc.task_oop;

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
        return "{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", salary='" + getSalary() + '\''
                + '}';
    }

}
