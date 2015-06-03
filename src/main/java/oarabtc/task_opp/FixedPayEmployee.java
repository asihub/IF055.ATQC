package oarabtc.task_opp;

public class FixedPayEmployee extends Employees {

    private double fixedPay;

    public FixedPayEmployee(int id, String name, String surname, double fixedPay) {
        super(id, name, surname);
        this.fixedPay = fixedPay;
    }

    public double getMonthlyPay() {
        return fixedPay;
    }
}
