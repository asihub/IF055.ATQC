//TODO one file - one class, move classes to separate files - FIXED
import java.util.List;
import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		
		List <EmployeeInfo> list = new ArrayList <EmployeeInfo>(10);
		
		list.add(0,new HourlyRateEmployee(1, "Ivan", "Ivanenko", 15));
		list.add(1,new HourlyRateEmployee(2, "Petro", "Petrenko", 20));
		list.add(2,new HourlyRateEmployee(3, "Dmytro", "Dmytrenko", 25));
		list.add(3,new HourlyRateEmployee(4, "Sergiy", "Sergienko", 30));
		list.add(4,new HourlyRateEmployee(5, "Yuriy", "Yurchenko", 35));
		
		list.add(5,new FixedRateEmployee(6, "Olga", "Olchenko", 2000));
		list.add(6,new FixedRateEmployee(7, "Igor", "Igorenko", 3000));
		list.add(7,new FixedRateEmployee(8, "Lyubov", "Lyubenko", 4000));
		list.add(8,new FixedRateEmployee(9, "Vasyl", "Vasylenko", 5000));
		list.add(9,new FixedRateEmployee(10, "Roman", "Romanenko", 6000)); 
		
		System.out.println("Information About Employee:");
      
		//TODO use for each loops - FIXED
	
		for (EmployeeInfo ei: list){
			System.out.println(ei);
		}
		
		
	}

	}


