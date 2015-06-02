package iilntc.task_oop;

public class HourSalaryWorker extends Worker {
    private double hours = 8;
    private double averageDays = 20.8;
    private double paymentPerHour;

    public HourSalaryWorker(int id, String name, String surname, double paymentPerHour) {
        super(id, name, surname);
        this.paymentPerHour = paymentPerHour;
    }

    public HourSalaryWorker(int id, String name, String surname, double paymentPerHour, double hours, double averageDays) {
        super(id, name, surname);
        this.paymentPerHour = paymentPerHour;
        this.hours = hours;
        this.averageDays = averageDays;
    }

    @Override
    public double monthlySalary() {
        return paymentPerHour * hours * averageDays;
    }

}
