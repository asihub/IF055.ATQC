public class Task1 {

    public static void main(String[] args) {

        Employees[] employeeses = new Employees[5];

        employeeses[0] = new FixedPayEmployee(1, "Bilbo", "Beggins", 500);
        employeeses[1] = new FixedPayEmployee(2, "Oleg", "Nadraga", 850);

        employeeses[2] = new HourlyPayEmployee(1, "Anakin", "Skywalker", 3.1);
        employeeses[3] = new HourlyPayEmployee(2, "QuiGon", "Jinn", 4.1);
        employeeses[4] = new HourlyPayEmployee(3, "Padme", "Amidala", 7.0);

        for (Employees employees : employeeses) { System.out.println(employees);}
    }
}
