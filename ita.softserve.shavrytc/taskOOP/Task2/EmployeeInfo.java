import java.util.Comparator;



public abstract class EmployeeInfo {
	private String name;
	private String surname;
	private int id;
	
	EmployeeInfo(int num, String n, String s){
		id = num;
		name = n;
		surname = s;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//TODO use toString() method instead of this + FIXED
	@Override
	public String toString(){
		return "#" + id +" " + name +" " + surname + " " + avarageSalary();
	};
	
	abstract double avarageSalary();
	
}
