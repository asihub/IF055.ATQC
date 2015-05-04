/**
 * Created by Olia on 26.04.2015.
 */


//TODO Java code convention!!! - FIXED
//TODO what's hourlyPayEm? HourlyPayEmployee maybe? - FIXED
public class HourlyPayEmployee extends Employees {

    private double hourlyPay;

    public HourlyPayEmployee(int id, String name, String surname, double hourlyPay) {
        super(id, name, surname);
        this.hourlyPay = hourlyPay;
        //TODO move this out to separate method - FIXED
        printInfo();
    }

    //TODO what's hPay? - FIXED
    public double hourPay;
    final double PAY_DAYS = 20.8;
    final int PAY_HOUR = 8;

    //TODO Java code convention!!! - FIXED
    public double payCalc() {
        return hourPay = (PAY_DAYS * PAY_HOUR * hourlyPay);
    }

    public void printInfo() {
        System.out.println("Employee: " + getName() + " " + getSurname() + " - " + payCalc() + " $");

    }
}