package akorctc.task_oop;

import java.util.List;

public abstract class Worker {

    public Worker(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    protected int id;
    protected String name;
    protected String lastname;
    protected double monthlyIncome;

    public abstract double getMonthlyIncome();

    public void getWorkerInfo() {
        StringBuilder result = new StringBuilder("");
        result.append(id).append(" ").append(name).append(" ").append(lastname).append(" ").append(monthlyIncome);

        System.out.println("|Mounthly Salary is| - |" + result);
    }

    public static void printList(List<Worker> fixedSalaryWorker) {
        fixedSalaryWorker.forEach(System.out::println);
    }
    public String getLastName(){
        return this.lastname;
    }

    @Override
    public String toString(){
         return this.id + "; " + this.name + " " + this.lastname + ": " + this.monthlyIncome;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //TODO method is unused, remove or use it
    public static void printList(List<Worker> fixedSalaryWorker, int i, String id) {
    }

    /* Method for Three name from Worker list
     * list - name of the list
     * number - � of elements to be printed
     * field - name of an element field to be printed
     */

    public static void printLastId(List<Worker> list, int number, String field) {
        switch (field) {
            case "id":
                System.out.println();
                list.stream().limit(number).forEach(n -> System.out.println(n.getId()));
                break;
            case "name":
                System.out.println();
                list.stream().limit(number).forEach(n -> System.out.println(n.getName()));
                break;
            case "last name":
                System.out.println();
                list.stream().limit(number).forEach(n -> System.out.println(n.getLastName()));
                break;
            default:
                System.out.println("Error");
        }
    }



    /* Method for Five id from Worker list
     * list - name of the list
     * number - � of elements to be printed
     * field - name of an element field to be printed
     */

    public static void printFirstNames(List<Worker> list, int number, String field) {
        switch (field) {
            case "id":
                System.out.println();
                list.stream().skip(list.size() - number).forEach(n -> System.out.println(n.getId()));
                break;
            case "name":
                System.out.println();
                list.stream().skip(list.size() - number).forEach(n -> System.out.println(n.getName()));
                break;
            case "last name":
                System.out.println();
                list.stream().skip(list.size() - number).forEach(n -> System.out.println(n.getLastName()));
                break;
            default:
                System.out.println("Error");
        }
    }
}



