
public class HourlyRateEmployee extends EmployeeInfo{
	double rate;

	final static double HOURS = 8; 
	final static double DAYS = 20.8;

	//TODO what's n and s? rename - FIXED
    HourlyRateEmployee(int id, String name, String surname, double rate){
		super(id, name, surname);
		this.rate = rate;
    }
    // Returns avarage salary of employee witn per hours rate		
    double avarageSalary(){
	return DAYS*HOURS*rate;
    };
	
}
