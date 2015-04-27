package ita.softserve.idyntc;


public class FixedSalaryEmployee extends Employee{

    private float  fixedSalary;

    public FixedSalaryEmployee(int id, String name, String surname, int fixedSalary){
        super.id=id;
        super.name= name;
        super.surname= surname;
        this.fixedSalary=fixedSalary;
    }

    /**
     * this method calculates the salary of fixed salary employees
     * @return salary for these employees
     */
    @Override
    public float getSalary() {
        if (fixedSalary<=0){
            System.out.println("Error input for fixed salary employees");
        }
        return fixedSalary;
    }
}
