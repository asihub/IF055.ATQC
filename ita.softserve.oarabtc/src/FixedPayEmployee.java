/**
 * Created by Olia on 26.04.2015.
 */
    //TODO Java code convention!!! - FIXED
    //TODO what's fixedPayEm? FixedPayEmployee maybe? - FIXED
    public class FixedPayEmployee extends Employees {

    //TODO what's fPay? - FIXED
    private double fixedPay;

    public FixedPayEmployee(int id, String name, String surname, double fixedPay) {
        super(id, name, surname);
        this.fixedPay = fixedPay;
        //TODO move this out to separate method - FIXED
        printInfo();
    }

    //TODO Java code convention!!! - FIXED
    public double payCalc() {
        return fixedPay;
    }

    public void printInfo() {
        System.out.println("Employee: " + getName() + " " + getSurname() + " - " + payCalc() + " $");
    }
}