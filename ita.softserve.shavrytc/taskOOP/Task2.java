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

		printList(hourlyRateEmployee);

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
		//TODO use "\nSome text ... " eg "\n-----------Fixed Rated ..."
		System.out.println("\n");
		System.out.println("-----------Fixed Rated Employee:-----------");
		
		printList(fixedRateEmployee);
	    //TODO use "\nSome text ... " eg "\n-----------Fixed Rated ..."
		System.out.println("\n"); 
		System.out.println("-----------Fixed Rated Employee after Sorting:-----------");
		

		Comparator <EmployeeInfo> employeeComparator = Comparator.comparing(EmployeeInfo::avarageSalary)
				.thenComparing(EmployeeInfo::getSurname);
						
		// Sorting Fixed Rate Employee
		fixedRateEmployee.sort(employeeComparator);

		printList(fixedRateEmployee);

		//TODO use "\nSome text ... " eg "\n-----------Fixed Rated ..."
		System.out.println("\n");
		System.out.println("-----------Hourly Rated Employee after Sorting:-----------");
			
		hourlyRateEmployee.sort(employeeComparator);
		printList(hourlyRateEmployee);
		
		System.out.println("\n");
		System.out.println("===============================================================");
		System.out.println("----The First 5 Persons And The Last 3 Persons In The List:----");
		System.out.println("===============================================================");

		//TODO use "\nSome text ... " eg "\n-----------Fixed Rated ..."
		System.out.println("\n");
		System.out.println("-----------Fixed Rated Employee:-----------");
		//TODO move out to a separate method
		for (int i=0; i<=9; i++){
			
			if ((i<5)^(i>7)){
				System.out.println(fixedRateEmployee.get(i));
			}	
		}

		//TODO use "\nSome text ... " eg "\n-----------Fixed Rated ..."
    	System.out.println("\n");
		System.out.println("-----------Hourly Rated Employee:-----------");

		//TODO move out to a separate method
		for (int i=0; i<=9; i++){
			
			if ((i<5)^(i>7)){
				System.out.println(hourlyRateEmployee.get(i));
			}	
			
		}
		
	}
	//TODO move out to some *employee or base class
		public static void printList (List <EmployeeInfo> employeeRate){
				
			for (EmployeeInfo employeeInfo: employeeRate){
				System.out.println(employeeInfo);
	        }
        }

}
