public class FixedSalaryWorker extends Worker {
    private double paymentPerMonth;

    public FixedSalaryWorker(int id, String name, String surname, double paymentPerMonth){
        super(id, name, surname);
        this.paymentPerMonth = paymentPerMonth;
    }
    @Override
    public double monthlySalary(){
        return paymentPerMonth;
    }
}
