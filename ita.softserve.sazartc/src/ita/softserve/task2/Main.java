package ita.softserve.task2;

public class Main {

	public static void main(String[] args) {
		
		Staff perHourStaff = fillPerHourStaff();
		System.out.println(perHourStaff.toString());
		perHourStaff.sort();
		System.out.println(perHourStaff.toString(5));
		System.out.println(perHourStaff.toString(-3));		

		Staff fixedRateStaff = fillFixedRateStaff();
		System.out.println(fixedRateStaff.toString());
		fixedRateStaff.sort();
		System.out.println(fixedRateStaff.toString(5));
		System.out.println(fixedRateStaff.toString(-3));
        
	}
	
	public static Staff fillPerHourStaff() {
		Staff staff = new Staff();
		staff.addEmployee(new PerHourEmployee(0, "Pats", "Yuriy", 25));
		staff.addEmployee(new PerHourEmployee(1, "Glynskiy", "Boghdan", 25));
		staff.addEmployee(new PerHourEmployee(2, "Putiatych", "Dmytro", 21));
		staff.addEmployee(new PerHourEmployee(3, "Polozovych", "Senko", 31));
		staff.addEmployee(new PerHourEmployee(4, "Dashkevych", "Ostafiy", 29));
		staff.addEmployee(new PerHourEmployee(5, "Liantskoronskiy", "Predslav", 40));
		staff.addEmployee(new PerHourEmployee(6, "Vyshnevetskiy", "Dmytro", 36));
		staff.addEmployee(new PerHourEmployee(7, "Madskiy", "Birulya", 34));
		staff.addEmployee(new PerHourEmployee(8, "Bilous", "Yatsko", 29));
		staff.addEmployee(new PerHourEmployee(9, "Liah", "Andriy", 35));	
		return staff;
	}
	
	public static Staff fillFixedRateStaff() {
		Staff staff = new Staff();
		staff.addEmployee(new FixedRateEmployee(0, "Pidkova", "Ivan", 8000));
		staff.addEmployee(new FixedRateEmployee(1, "Chornynskiy", "Lukian", 8250));
		staff.addEmployee(new FixedRateEmployee(2, "Zborovskiy", "Samiylo", 7360));
		staff.addEmployee(new FixedRateEmployee(3, "Mykoshynskiy", "Boghdan", 9200));
		staff.addEmployee(new FixedRateEmployee(4, "Ruzhynskiy", "Mykhaylo", 7800));
		staff.addEmployee(new FixedRateEmployee(5, "Kulagha", "Zakhar", 8150));
		staff.addEmployee(new FixedRateEmployee(6, "Loboda", "Grygoriy", 10000));
		staff.addEmployee(new FixedRateEmployee(7, "Nalyvayko", "Severyn", 12500));
		staff.addEmployee(new FixedRateEmployee(8, "Shaula", "Matviy", 9600));
		staff.addEmployee(new FixedRateEmployee(9, "Krempskiy", "Krzyshtop", 7850));
		return staff;
	}	

}
