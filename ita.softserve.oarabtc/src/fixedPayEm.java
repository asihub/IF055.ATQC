/**
 * Created by Olia on 26.04.2015.
 */
    public class fixedPayEm extends employees {


    private double fPay;

    public fixedPayEm(int id, String name, String surname, double fPay) {
        super(id, name, surname);
        this.fPay = fPay;
        System.out.println("Employee: " + getName() + " " + getSurname() + " - " + PayCalc() + " $");
    }


    public double PayCalc() {
       return fPay;
    }
}