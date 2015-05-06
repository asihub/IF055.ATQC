
public abstract class EmployeeInfo {
	private String name;
	private String surname;
	private int id;

	EmployeeInfo(int id, String name, String surname ){
		this.id = id ;
		this.name = name;
		this.surname = surname;
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
        //prints info about employee
	@Override
	public String toString(){
		return "#" + id +" " + name +" " + surname + " " + avarageSalary();
	};
	
	abstract double avarageSalary();


}
