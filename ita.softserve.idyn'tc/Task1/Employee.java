package ita.softserve.idyntc;


public abstract class Employee {

    protected int id;
    protected String name;
    protected String surname;

    public abstract float getSalary();

    /**
     * this method helps to print employees info more correctly
     * @return   employees information
     */
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary='" + getSalary() + '\'' +
                '}';
    }
}
