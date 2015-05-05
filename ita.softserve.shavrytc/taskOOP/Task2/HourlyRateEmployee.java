
public class HourlyRateEmployee extends EmployeeInfo{
		
	double rate;

	final static double HOURS = 8; 
	final static double DAYS = 20.8;

	//TODO what's n and s? rename
    HourlyRateEmployee(int num, String n, String s, double rate){
		super(num, n, s);
		this.rate = rate;
	}
		
	double avarageSalary(){
		return DAYS*HOURS*rate;
	};
}

