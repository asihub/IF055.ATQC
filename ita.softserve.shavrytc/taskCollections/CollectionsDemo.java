
import java.util.*;


public class CollectionsDemo {

	public static void main(String[] args) {
		
		List <EmployeeInfo> list = new ArrayList <EmployeeInfo>(20);
         
		list.add(new EmployeeInfo(1, "Ivan", "Ivanenko"));
		list.add(new EmployeeInfo(2, "Petro", "Petrenko"));
		list.add(new EmployeeInfo(3, "Dmytro", "Dmytrenko"));
		list.add(new EmployeeInfo(4, "Sergiy", "Sergienko"));
		
		System.out.println("List of Emloyees:");
		
		for (EmployeeInfo ar :list){
			System.out.println(ar);}
		
		System.out.println();
		
		
		Map <Integer, EmployeeInfo> hmap = new HashMap<Integer, EmployeeInfo>(20);
		
		hmap.put(1, new EmployeeInfo(5, "Olga", "Olchenko"));
		hmap.put(2, new EmployeeInfo(6, "Igor", "Igorenko"));
		hmap.put(3, new EmployeeInfo(7, "Lyubov", "Lyubenko"));
		hmap.put(4, new EmployeeInfo(8, "Vasyl", "Vasylenko"));
		
		System.out.println("Map of Employees:");
		
		Set<Map.Entry<Integer, EmployeeInfo>> set = hmap.entrySet();
		for (Map.Entry<Integer, EmployeeInfo> me: set){
			System.out.println(me);}
			
		System.out.println();
		
		list.add(new EmployeeInfo(5, "Dmytro", "Dmytrenko"));
		list.remove(3);
		list.set(3, new EmployeeInfo(4, "Sergiy", "Sergienko"));
		
		hmap.put(5, new EmployeeInfo(8, "Roman", "Romanenko"));
		hmap.remove(4);
		
		System.out.println("Modified List of Emloyees:");
		
		for (EmployeeInfo ar :list){
			System.out.println(ar);}
			
		System.out.println();
		
		System.out.println("Modified Map of Employees:");
		
		Set<Map.Entry<Integer, EmployeeInfo>> set2 = hmap.entrySet();
		for (Map.Entry<Integer, EmployeeInfo> me: set2){
			System.out.println(me);}
			System.out.println();
		
		
}
}
