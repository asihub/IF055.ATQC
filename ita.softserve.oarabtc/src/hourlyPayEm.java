/**
 * Created by Olia on 26.04.2015.
 */
public class hourlyPayEm extends employees {

    private double hourlyPay;
    public hourlyPayEm (int id, String name, String surname, double hourlyPay) {
        super(id, name, surname);
        this.hourlyPay = hourlyPay;
        System.out.println("Employee: " + getName() + " " + getSurname() + " - " + PayCalc() + " $");
    }


    public double hPay;
    public double PayCalc() {
        return hPay = (20.8 * 8 * hourlyPay); }

}
