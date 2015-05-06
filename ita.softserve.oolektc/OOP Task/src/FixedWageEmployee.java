
public class FixedWageEmployee extends Employee {

    final private double fixedWage;

    public FixedWageEmployee(int id, String name, String lastName, double fixedWage) {
        super(id, name, lastName);
        this.fixedWage = fixedWage;
        this.monthlyWage = getMonthlyWage();
    }

    @Override
    public double getMonthlyWage() {
        return fixedWage;
    }
}

