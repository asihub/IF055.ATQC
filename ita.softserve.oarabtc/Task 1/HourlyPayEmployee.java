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
    //TODO Java code convention!!! - FIXED
    public double payCalc() {
        return hourPay = (20.8 * 8 * hourlyPay); }

    public void printInfo() {
        System.out.println("Employee: " + getName() + " " + getSurname() + " - " + payCalc() + " $");
    }

}