package if055_atqc;

abstract class Salary {
	String name;
	String surname;
	int id;
	Salary(int num, String n, String s){
		id = num;
		name = n;
		surname = s;
	}
	
	public void employeeInfo(){
		System.out.print("#" + id );
		System.out.print(" " + name );
		System.out.print(" " + surname );
	}
	
	abstract double avarageSalary();
}

class HourlyRate extends Salary{
	double rate;
	HourlyRate(int num, String n, String s, double r){
		super(num, n, s);
		rate = r;
	}
	
	double avarageSalary(){
		return 20.8*8*rate;
		
	};
}

class FixedRate extends Salary{
	double rate;
	FixedRate(int num, String n, String s, double r){
		super(num, n, s);
		rate = r;
	}
	double avarageSalary(){
		return rate;
	};
}
public class SalaryCalculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*HourlyRate hr1 = new HourlyRate(1, "Ivan", "Ivanenko", 15);
		HourlyRate hr2 = new HourlyRate(2, "Petro", "Petrenko", 20);
		HourlyRate hr3 = new HourlyRate(3, "Dmytro", "Dmytrenko", 25);
		HourlyRate hr4 = new HourlyRate(4, "Sergiy", "Sergienko", 30);
		HourlyRate hr5 = new HourlyRate(5, "Yuriy", "Yurchenko", 35);
		FixedRate fr1 = new FixedRate(6, "Olga", "Olchenko", 2000);
		FixedRate fr2 = new FixedRate(7, "Igor", "Igorenko", 3000);
		FixedRate fr3 = new FixedRate(8, "Lyubov", "Lyubenko", 4000);
		FixedRate fr4 = new FixedRate(9, "Vasyl", "Vasylenko", 5000);
		FixedRate fr5 = new FixedRate(10, "Roman", "Romanenko", 6000);*/

		HourlyRate [] hrArr = new HourlyRate[5];
		hrArr[0] = new HourlyRate(1, "Ivan", "Ivanenko", 15);
		hrArr[1] = new HourlyRate(2, "Petro", "Petrenko", 20);
		hrArr[2] = new HourlyRate(3, "Dmytro", "Dmytrenko", 25);
		hrArr[3] = new HourlyRate(4, "Sergiy", "Sergienko", 30);
		hrArr[4] = new HourlyRate(5, "Yuriy", "Yurchenko", 35);
		
		FixedRate [] frArr = new FixedRate[5];
		frArr[0] = new FixedRate(6, "Olga", "Olchenko", 2000);
		frArr[1] = new FixedRate(7, "Igor", "Igorenko", 3000);
		frArr[2] = new FixedRate(8, "Lyubov", "Lyubenko", 4000);
		frArr[3] = new FixedRate(9, "Vasyl", "Vasylenko", 5000);
		frArr[4] = new FixedRate(10, "Roman", "Romanenko", 6000);
		
		System.out.println("Information About Employee:");
		
		System.out.println(" Avarage Salary (Hourly Rated): ");
		for (int i=0; i < hrArr.length;i++){
			hrArr[i].employeeInfo();
			System.out.println(hrArr[i].avarageSalary() );
		}
		
		System.out.println(" Avarage Salary (Hourly Rated): ");
		for (int i=0; i < frArr.length;i++){
			hrArr[i].employeeInfo();
			System.out.println(frArr[i].avarageSalary() );
		}
		
	}

}
