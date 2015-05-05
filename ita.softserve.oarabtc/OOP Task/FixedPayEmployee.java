/**
 * Created by Olia on 26.04.2015.
 */

    public class FixedPayEmployee extends Employees {

    private double fixedPay;

    public FixedPayEmployee(int id, String name, String surname, double fixedPay) {
        super(id, name, surname);
        this.fixedPay = fixedPay;
        printInfo();
    }

    public double payCalc() {
        return fixedPay;
    }

    public void printInfo() {
        System.out.println("Employee: " + getName() + " " + getSurname() + " - " + payCalc() + " $");
    }
}
