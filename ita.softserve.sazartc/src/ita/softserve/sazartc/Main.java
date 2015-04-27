package ita.softserve.sazartc;

public class Main {
	
	public static PerHourEmployee[] perHourEmployees;	
	public static FixedRateEmployee[] fixedRateEmployees;

	public static void main(String[] args) {

		perHourEmployees = new PerHourEmployee[3];
		perHourEmployees[0] = new PerHourEmployee(0, "Петренко", "Володимир", 25);
		perHourEmployees[1] = new PerHourEmployee(1, "Наказнюк", "Дмитро", 30);
		perHourEmployees[2] = new PerHourEmployee(2, "Павлюк", "Олег", 28);
		
		for(int i=0; i<3; i++) {
			perHourEmployees[i].SalaryPrint();
		}
		
		fixedRateEmployees = new FixedRateEmployee[3];
		fixedRateEmployees[0] = new FixedRateEmployee(3, "Остапчук", "Галина", 2500);
		fixedRateEmployees[1] = new FixedRateEmployee(4, "Мельник", "Василина", 3000);
		fixedRateEmployees[2] = new FixedRateEmployee(5, "Андрюк", "Оксана", 2800);
		
		for(int i=0; i<3; i++) {
			fixedRateEmployees[i].SalaryPrint();
		}
	}

}
