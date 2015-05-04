
public class HourlyRateEmployee extends EmployeeInfo{
		
	double rate;
	//TODO what's r? +FIXED
	final static double HOURS = 8; 
	final static double DAYS = 20.8; 
		
	HourlyRateEmployee(int num, String n, String s, double rate){
		super(num, n, s);
		this.rate = rate;
	}
		
	double avarageSalary(){
		return DAYS*HOURS*rate;
	};
}

