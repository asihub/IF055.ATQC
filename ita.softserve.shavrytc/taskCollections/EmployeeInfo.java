
public class EmployeeInfo {
	private String name;
	private String surname;
	private int id;
	EmployeeInfo(int num, String n, String s){
		id = num;
		name = n;
		surname = s;
	}
	
	@Override
	public String toString(){
		return "#" + id +" " + name +" " + surname;
	}
	
}
