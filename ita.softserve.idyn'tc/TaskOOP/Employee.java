package ita.softserve.idyntc;

import java.util.List;


public abstract class Employee {

    protected int id;
    protected String name;
    protected String surname;

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

    /**
     * this method gets the employee from arraylist
     *
     * @param list       choose the list which you'd like
     * @param firstIndex output from first index of list
     * @param lastIndex  output to lastIndex of this list
     * @param data       kind of data, for eaxample: ID, Name or Surname
     */


    public static void printEmployeeFromRange(List<Employee> list, int firstIndex, int lastIndex, String data) {
        try {

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
     * this method gets the employee from arrayliste
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

}
