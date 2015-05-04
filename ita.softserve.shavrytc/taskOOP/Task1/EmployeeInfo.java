
public abstract class EmployeeInfo {
	private String name;
	private String surname;
	private int id;
	EmployeeInfo(int num, String n, String s){
		id = num;
		name = n;
		surname = s;
	}
	//TODO use toString() method instead of this + FIXED
	public String toString(){
		return "#" + id +" " + name +" " + surname + " " + avarageSalary();
	}
	
	abstract double avarageSalary();
}
