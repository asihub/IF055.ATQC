package ita.softserve.idyntc;

public class PerHourSalaryEmployee extends Employee{

    private float hourlyRate;


    public PerHourSalaryEmployee(int id, String name, String surname, float hourlyRate){
        super.id=id;
        super.name=name;
        super.surname=surname;
        this.hourlyRate=hourlyRate;
    }

    /**
     * this method calculates the salary of per hour salary employees

     * @return salary for these employees
     */
    @Override
    public float getSalary() {
        if (hourlyRate<=0){
            System.out.printf("Error input for per hourly salary employees");
        }
        return (float) (20.8*8*hourlyRate);
    }
}
