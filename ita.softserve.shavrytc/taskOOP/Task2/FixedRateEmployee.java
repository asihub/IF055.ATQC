
public class FixedRateEmployee extends EmployeeInfo{
		
	double rate;
		
	//TODO what's r? +FIXED
	FixedRateEmployee(int num, String n, String s, double rate){
		super(num, n, s);
		this.rate = rate;
	}
	    
	double avarageSalary(){
		return rate;
	};
}

