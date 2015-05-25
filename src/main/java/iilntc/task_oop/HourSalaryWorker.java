package iilntc.task_oop;

public class HourSalaryWorker extends Worker {
    private double paymentPerHour;

    public HourSalaryWorker(int id, String name, String surname, double paymentPerHour) {
        super(id, name, surname);
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public double monthlySalary() {
        double hours = 8.00;
        double averageDays = 20.80;
        return paymentPerHour * hours * averageDays;
    }
}
