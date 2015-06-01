/*
* Copyright (C) 2015 CollectionsTask Project by Ihor Dynka
 */

package idyntc.collections;

import java.util.*;

/**
 * Created by Ihor Dynka on 02.05.2015.
 */
public class CollectionsTask {
    public static void main(String[] args) {
        Students student1 = new Students("Danilo", "Chico", "ATQC-08-09");
        Students student2 = new Students("Tim", "Tyson", "MQC-08-09");
        Students student3 = new Students("Ruby", "Ho", "WebUI-08-09");
        Students student4 = new Students("John", "Branson", "ATQC-08-09");
        Students student5 = new Students("Lee", "Kim", "ATQC-08-09");
/**
 *   create students list and add new students in it
 *   output in console,
 *   modify students list (add, remove and change)
 */
        List<Students> studentsList = new LinkedList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);

        System.out.println("\tList of students");

        for (Students students : studentsList) {
            System.out.println(students);
        }

        ListIterator<Students> listIterator = studentsList.listIterator();

        while (listIterator.hasNext()) {
            if (listIterator.next().getGroup().equals("ATQC-08-09")) {
                listIterator.remove();
            }
            if (listIterator.nextIndex() == studentsList.size()) {
                listIterator.add(new Students("Jack", "Daniels", "MQC-08-09"));
                listIterator.add(new Students("Chuch", "Norris", "MQC--08-09"));
            }
        }
        studentsList.set(3, new Students("Mike", "Matusov", "ATQC-08-09"));

        System.out.println("\tModified list of students");
        for (Students students : studentsList) {
            System.out.println(students);
        }

/**
 *   create students map and put new students in it
 *   output in console,
 *   modify students list (add, remove and change)
 */
        Map<Integer, Students> studentsMap = new HashMap<>();
        studentsMap.put(studentsMap.size() + 1, student1);
        studentsMap.put(studentsMap.size() + 1, student2);
        studentsMap.put(studentsMap.size() + 1, student3);
        studentsMap.put(studentsMap.size() + 1, student4);

        System.out.println("\tMap of students:");
        for (Map.Entry entry : studentsMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        studentsMap.get(1).setGroup("WebUI-08-09");
        studentsMap.remove(1);
        studentsMap.put(studentsMap.size() + 1, student5);

        System.out.println("\tModified map of student:");
        for (Map.Entry students : studentsMap.entrySet()) {
            System.out.println(students.getValue());
        }

    }
}
