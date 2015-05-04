/**
 * Created by Olia on 26.04.2015.
 */
//TODO Java code convention!!! - FIXED
public abstract class Employees {

    private int id;
    private String name;
    private String surname;

   public int getId() {
       return id;
   }
   public String getName() {
       return name;
   }
   public String getSurname() {
       return surname;
   }

    public Employees(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    //TODO Java code convention!!! - FIXED
    public abstract double payCalc();

    public abstract void printInfo();

    @Override
    public String toString() {
        return "Employee: " + "(id " + getId() + ") " + getName() + " - " + payCalc() + " $";
    }

}
