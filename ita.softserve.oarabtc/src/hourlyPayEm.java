/**
 * Created by Olia on 26.04.2015.
 */
//TODO Java code convention!!!
//TODO what's hourlyPayEm? HourlyPayEmployee maybe?
public class hourlyPayEm extends employees {

    private double hourlyPay;
    public hourlyPayEm (int id, String name, String surname, double hourlyPay) {
        super(id, name, surname);
        this.hourlyPay = hourlyPay;
        //TODO move this out to separate method
        System.out.println("Employee: " + getName() + " " + getSurname() + " - " + PayCalc() + " $");
    }

    //TODO what's hPay?
    public double hPay;
    //TODO Java code convention!!!
    public double PayCalc() {
        return hPay = (20.8 * 8 * hourlyPay); }

}
