
public class HourlyRateEmployee extends EmployeeInfo{
		double rate;
	    //TODO what's r? +FIXED
		
		HourlyRateEmployee(int num, String n, String s, double rate){
			super(num, n, s);
			this.rate = rate;
		}
		
		double avarageSalary(){
			return 20.8*8*rate;
			
		};
	}

