package iilntc.task_oop;

public class HourSalaryWorker extends Worker {
    private double HOURS = 8;
    private double AVERAGE_DAYS = 20.8;
    private double paymentPerHour;
    //TODO code convention, remove unused
    public double getHOURS() {
        return HOURS;
    }

    public void setHOURS(double HOURS) {
        this.HOURS = HOURS;
    }

    public double getAVERAGE_DAYS() {
        return AVERAGE_DAYS;
    }

    public void setAVERAGE_DAYS(double AVERAGE_DAYS) {
        this.AVERAGE_DAYS = AVERAGE_DAYS;
    }

    public HourSalaryWorker(int id, String name, String surname, double paymentPerHour) {
        super(id, name, surname);
        this.paymentPerHour = paymentPerHour;
    }

    public HourSalaryWorker(int id, String name, String surname, double paymentPerHour, double HOURS, double AVERAGE_DAYS) {
        super(id, name, surname);
        this.paymentPerHour = paymentPerHour;
        this.HOURS = HOURS;
        this.AVERAGE_DAYS = AVERAGE_DAYS;
    }

    @Override
    public double monthlySalary() {
        return paymentPerHour * HOURS * AVERAGE_DAYS;
    }

}
