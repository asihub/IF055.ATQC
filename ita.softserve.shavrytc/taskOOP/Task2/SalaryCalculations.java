//TODO one file - one class, move classes to separate files
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SalaryCalculations  {

	public static void main(String[] args) {
		
		System.out.println("=============================================");
		System.out.println("           Information About Employee:");
		System.out.println("=============================================");
		//TODO use "\n" for new lines
		System.out.println("");

		//TODO what's hre?
		List <HourlyRateEmployee> hre = new ArrayList <HourlyRateEmployee>(20);
		
		hre.add(new HourlyRateEmployee(1, "Ivan", "Ivanenko", 15));
		hre.add(new HourlyRateEmployee(2, "Petro", "Petrenko", 20));
		hre.add(new HourlyRateEmployee(3, "Dmytro", "Dmytrenko", 25));
		hre.add(new HourlyRateEmployee(4, "Sergiy", "Sergienko", 30));
		hre.add(new HourlyRateEmployee(5, "Yuriy", "Yurchenko", 35));
		hre.add(new HourlyRateEmployee(6, "Jaroslav", "Ivanenko", 15));
		hre.add(new HourlyRateEmployee(7, "Ivan", "Petrenko", 20));
		hre.add(new HourlyRateEmployee(8, "Volodymyr", "Dmytrenko", 25));
		hre.add(new HourlyRateEmployee(9, "Yaropolk", "Sergienko", 30));
		hre.add(new HourlyRateEmployee(10, "Oleg", "Yurchenko", 35));
		
		System.out.println("-----------Hourly Rated Employee:-----------");
				
		for (EmployeeInfo ei: hre){
			System.out.println(ei);
		}

		//TODO use "\n" for new lines
		System.out.println();

		//TODO what's fre?
		List <EmployeeInfo> fre = new ArrayList <EmployeeInfo>(20);
		
		fre.add(new FixedRateEmployee(1, "Olga", "Olshenko", 2000));
		fre.add(new FixedRateEmployee(2, "Igor", "Ugorenko", 3000));
		fre.add(new FixedRateEmployee(3, "Lyubov", "Lyubenko", 4000));
		fre.add(new FixedRateEmployee(4, "Vasyl", "Vasylenko", 5000));
		fre.add(new FixedRateEmployee(5, "Roman", "Romanenko", 6000)); 
		fre.add(new FixedRateEmployee(6, "Vira", "Olchenko", 2000));
		fre.add(new FixedRateEmployee(7, "Dina", "Igorenko", 3000));
		fre.add(new FixedRateEmployee(8, "Ira", "Lyubenko", 4000));
		fre.add(new FixedRateEmployee(9, "Stepan", "Vasylechko", 5000));
		fre.add(new FixedRateEmployee(10, "Yuriy", "Romanenko", 6000)); 
		      
		System.out.println("-----------Fixed Rated Employee:-----------");

		//TODO what's ei?
		for (EmployeeInfo ei: fre){
			System.out.println(ei);
		}
		//TODO use "\n" for new lines
		System.out.println("");
		System.out.println("-----------Fixed Rated Employee after Sorting:-----------");
		//TODO use "\n" for new lines
		System.out.println("");
		//TODO use Comparator.comparing(), it's less code
		Comparator <EmployeeInfo> employeeComparator = new Comparator<EmployeeInfo>(){
			
			@Override
			public int compare(EmployeeInfo hre1, EmployeeInfo hre2) {
				// TODO Auto-generated method stub
				
				if (hre1.avarageSalary() > hre2.avarageSalary()) {
					return 1;
				}
				
					else if (hre1.avarageSalary() < hre2.avarageSalary()){
						return -1;
					}
				
						else if (hre1.getSurname().compareTo(hre2.getSurname())>0){
							return 1;
						}
				
							else if (hre1.getSurname().compareTo(hre2.getSurname())<0){
								return -1;
							}
								else return hre1.getName().compareTo(hre2.getName());
			}
		
		};
		
		// Sorting Fixed Rate Employee
		
		fre.sort(employeeComparator);
		//TODO create a separate printing method
		for (EmployeeInfo f: fre){
			System.out.println(f);
		}
			
		// Sorting Hourly Rate Employee 
		
		System.out.println("");
		System.out.println("-----------Hourly Rated Employee after Sorting:-----------");
		System.out.println("");
			
		hre.sort(employeeComparator);
		//TODO create a separate printing method
		//TODO What's f?
		for (EmployeeInfo f: hre){
			System.out.println(f);
		}
		
		
		System.out.println("===============================================================");
		System.out.println("----The First 5 Persons And The Last 3 Persons In The List:----");
		System.out.println("===============================================================");
		
		System.out.println("-----------Fixed Rated Employee:-----------");
		
		for (int i=0; i<=9; i++){
			
				if ((i<5)^(i>7)){
					System.out.println(fre.get(i));
				}	
		}
		
		System.out.println("-----------Hourly Rated Employee:-----------");
		
		for (int i=0; i<=9; i++){
			
			if ((i<5)^(i>7)){
				System.out.println(hre.get(i));
			}	
		}
		
	}

}

	


