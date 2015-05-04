import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        Double wage1 = o1.getMonthlyWage();
        Double wage2 = o2.getMonthlyWage();

        String lastName1 = o1.getLastName();
        String lastName2 = o2.getLastName();

        int wageResult = wage1.compareTo(wage2);
        int lastNameResult = lastName1.compareTo(lastName2);

        if (wageResult != 0) {
            return wageResult;
        }

        return lastNameResult;
    }
}
