public class HourlyPayEmployee extends Employees {

    private double hourlyPay;

    public HourlyPayEmployee(int id, String name, String surname, double hourlyPay) {
        super(id, name, surname);
        this.hourlyPay = hourlyPay;
    }

    private static double PAY_DAYS = 20.8;
    private static int PAY_HOUR = 8;

    public static double getPayDays() {
        return PAY_DAYS;
    }

    public static int getPayHour() {
        return PAY_HOUR;
    }

    public static void setPayDays(double payDays) {
        PAY_DAYS = payDays;
    }

    public static void setPayHour(int payHour) {
        PAY_HOUR = payHour;
    }

    public double hourPay;

    public double payCalc() {
        return hourPay = (PAY_DAYS * PAY_HOUR * hourlyPay);
    }
}
