package idyntc.collections;

import java.util.*;

/**
 * Created by Ihor Dynka on 02.05.2015.
 */
//TODO reformat comments
public class CollectionsTask {
    public static void main(String[] args) {
        Students student1 = new Students("Danilo", "Chico", "ATQC-08-09");
        Students student2 = new Students("Tim", "Tyson", "MQC-08-09");
        Students student3 = new Students("Ruby", "Ho", "WebUI-08-09");
        Students student4 = new Students("John", "Branson", "ATQC-08-09");
        Students student5 = new Students("Lee", "Kim", "ATQC-08-09");

// adding new students to studentsList
        List<Students> studentsList = new LinkedList<Students>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);

//output list of students
        System.out.println("\tList of students");

        for (Students students : studentsList) {
            System.out.println(students);
        }

        ListIterator<Students> iterator = studentsList.listIterator();

//modyfing list of student(adding, removing and changing elements)
        while (iterator.hasNext()) {
            if (iterator.next().getGroup().equals("ATQC-08-09")) {
                iterator.remove();
            }
            if (iterator.nextIndex() == studentsList.size()) {
                iterator.add(new Students("Jack", "Daniels", "MQC-08-09"));
                iterator.add(new Students("Chuch", "Norris", "MQC--08-09"));
            }
        }
        studentsList.set(3, new Students("Mike", "Matusov", "ATQC-08-09"));

//output modified list of students
        System.out.println("\tModified list of students");
        for (Students students : studentsList) {
            System.out.println(students);
        }

//create the new map of students and putting new elements to them
        Map<Integer, Students> studentsMap = new HashMap<Integer, Students>();
        studentsMap.put(studentsMap.size() + 1, student1);
        studentsMap.put(studentsMap.size() + 1, student2);
        studentsMap.put(studentsMap.size() + 1, student3);
        studentsMap.put(studentsMap.size() + 1, student4);

//output the map of student
        System.out.println("\tMap of students:");
        for (Map.Entry entry : studentsMap.entrySet()) {
            System.out.println(entry.getValue());
        }

//modifing elements of mapStudents(adding, removing and changing elements)
        studentsMap.get(1).setGroup("WebUI-08-09");
        studentsMap.remove(1);
        studentsMap.put(studentsMap.size() + 1, student5);

//output modified map of students        
        System.out.println("\tModified map of student:");
        for (Map.Entry entry : studentsMap.entrySet()) {
            System.out.println(entry.getValue());
        }

    }
}
