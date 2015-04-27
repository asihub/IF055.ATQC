/**
 * Created by Olia on 26.04.2015.
 */
    //TODO Java code convention!!!
    //TODO what's fixedPayEm? FixedPayEmployee maybe?
    public class fixedPayEm extends employees {

    //TODO what's fPay?
    private double fPay;

    public fixedPayEm(int id, String name, String surname, double fPay) {
        super(id, name, surname);
        this.fPay = fPay;
        //TODO move this out to separate method
        System.out.println("Employee: " + getName() + " " + getSurname() + " - " + PayCalc() + " $");
    }

    //TODO Java code convention!!!
    public double PayCalc() {
       return fPay;
    }
}