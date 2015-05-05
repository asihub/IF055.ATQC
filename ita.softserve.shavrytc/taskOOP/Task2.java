import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Task2 {
	
public static void main(String[] args) {
		
		System.out.println("=============================================");
		System.out.println("           Information About Employee:");
		System.out.println("=============================================");
		//TODO use "\n" for new lines - FIXED
		System.out.println("\n");

		//TODO what's hre? - FIXED
		List <EmployeeInfo> hourlyRateEmployee = new ArrayList <EmployeeInfo>(20);
		
		hourlyRateEmployee.add(new HourlyRateEmployee(1, "Ivan", "Ivanenko", 15));
		hourlyRateEmployee.add(new HourlyRateEmployee(2, "Petro", "Petrenko", 20));
		hourlyRateEmployee.add(new HourlyRateEmployee(3, "Dmytro", "Dmytrenko", 25));
		hourlyRateEmployee.add(new HourlyRateEmployee(4, "Sergiy", "Sergienko", 30));
		hourlyRateEmployee.add(new HourlyRateEmployee(5, "Yuriy", "Yurchenko", 35));
		hourlyRateEmployee.add(new HourlyRateEmployee(6, "Jaroslav", "Ivanenko", 15));
		hourlyRateEmployee.add(new HourlyRateEmployee(7, "Ivan", "Petrenko", 20));
		hourlyRateEmployee.add(new HourlyRateEmployee(8, "Volodymyr", "Dmytrenko", 25));
		hourlyRateEmployee.add(new HourlyRateEmployee(9, "Yaropolk", "Sergienko", 30));
		hourlyRateEmployee.add(new HourlyRateEmployee(10, "Oleg", "Yurchenko", 35));
		
		System.out.println("-----------Hourly Rated Employee:-----------");
		//TODO use "\n" for new lines - FIXED
				
		printList(hourlyRateEmployee);

		//TODO what's fre? - FIXED
		List <EmployeeInfo> fixedRateEmployee = new ArrayList <EmployeeInfo>(20);
		
		fixedRateEmployee.add(new FixedRateEmployee(1, "Olga", "Olshenko", 2000));
		fixedRateEmployee.add(new FixedRateEmployee(2, "Igor", "Ugorenko", 3000));
		fixedRateEmployee.add(new FixedRateEmployee(3, "Lyubov", "Lyubenko", 4000));
		fixedRateEmployee.add(new FixedRateEmployee(4, "Vasyl", "Vasylenko", 5000));
		fixedRateEmployee.add(new FixedRateEmployee(5, "Roman", "Romanenko", 6000)); 
		fixedRateEmployee.add(new FixedRateEmployee(6, "Vira", "Olchenko", 2000));
		fixedRateEmployee.add(new FixedRateEmployee(7, "Dina", "Igorenko", 3000));
		fixedRateEmployee.add(new FixedRateEmployee(8, "Ira", "Lyubenko", 4000));
		fixedRateEmployee.add(new FixedRateEmployee(9, "Stepan", "Vasylechko", 5000));
		fixedRateEmployee.add(new FixedRateEmployee(10, "Yuriy", "Romanenko", 6000)); 
		//TODO use "\n" for new lines - FIXED
		System.out.println("\n");
		System.out.println("-----------Fixed Rated Employee:-----------");
		
		//TODO what's ei? - FIXED
		printList(fixedRateEmployee);
		//TODO use "\n" for new lines - FIXED
		System.out.println("\n"); 
		System.out.println("-----------Fixed Rated Employee after Sorting:-----------");
		
		//TODO use Comparator.comparing(), it's less code - FIXED
		
		Comparator <EmployeeInfo> employeeComparator = Comparator.comparing(EmployeeInfo::avarageSalary)
				.thenComparing(EmployeeInfo::getSurname);
						
		// Sorting Fixed Rate Employee
		fixedRateEmployee.sort(employeeComparator);
		//TODO create a separate printing method -FIXED
		printList(fixedRateEmployee);
			
		// Sorting Hourly Rate Employee 
		System.out.println("\n");
		System.out.println("-----------Hourly Rated Employee after Sorting:-----------");
			
		hourlyRateEmployee.sort(employeeComparator);
		//TODO create a separate printing method
		//TODO What's f? - FIXED
		printList(hourlyRateEmployee);
		
		System.out.println("\n");
		System.out.println("===============================================================");
		System.out.println("----The First 5 Persons And The Last 3 Persons In The List:----");
		System.out.println("===============================================================");
		System.out.println("\n");
		System.out.println("-----------Fixed Rated Employee:-----------");
		
		for (int i=0; i<=9; i++){
			
			if ((i<5)^(i>7)){
				System.out.println(fixedRateEmployee.get(i));
			}	
		}
		
		System.out.println("\n");
		System.out.println("-----------Hourly Rated Employee:-----------");
		
		for (int i=0; i<=9; i++){
			
			if ((i<5)^(i>7)){
				System.out.println(hourlyRateEmployee.get(i));
			}	
			
		}
		
	}

		public static void printList (List <EmployeeInfo> employeeRate){
				
			for (EmployeeInfo employeeInfo: employeeRate){
				System.out.println(employeeInfo);
	        }
        }

}
