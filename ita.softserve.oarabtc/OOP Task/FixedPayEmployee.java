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
//TODO use toString() instead of this and add a separate print method
    public void printInfo() {
        System.out.println("Employee: " + getName() + " " + getSurname() + " - " + payCalc() + " $");
    }
}
