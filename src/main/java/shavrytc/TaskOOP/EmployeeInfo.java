package shavrytc.TaskOOP;

import java.util.ArrayList;
import java.util.List;


public abstract class EmployeeInfo {
	private String name;
	private String surname;
	private int id;
	
	List <EmployeeInfo> employeeRate = new ArrayList <EmployeeInfo>();

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
	
	public static void printList (List <EmployeeInfo> employeeRate){
		for (EmployeeInfo employeeInfo: employeeRate){
			System.out.println(employeeInfo);
        }
    }
	
	public static void printInterval(List <EmployeeInfo> employeeRate, String str, int arg1, int arg2){
		switch(str){
			case "Id": 
				for(int i=arg1-1; i<arg2; i++){
				System.out.println(employeeRate.get(i));
				}
				break;
			case "Name": 
				for(int i=arg1-1; i<arg2; i++){
				System.out.println(employeeRate.get(i));
				}
				break;
			case "Surname": 
				for(int i=arg1-1; i<arg2; i++){
				System.out.println(employeeRate.get(i));
				}
				break;
		}
	}

}
