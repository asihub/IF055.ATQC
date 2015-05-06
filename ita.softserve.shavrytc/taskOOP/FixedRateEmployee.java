
public class FixedRateEmployee extends EmployeeInfo{
	double rate;
	
	FixedRateEmployee(int id, String name, String surname, double rate){
		super(id, name, surname);
		this.rate = rate;
	}
	//Returns avarage salary of employee with fixed rate
	double avarageSalary(){
		return rate;
	};


}
