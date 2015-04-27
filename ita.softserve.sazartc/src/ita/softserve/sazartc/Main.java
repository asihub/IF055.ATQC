package ita.softserve.sazartc;

public class Main {
	//TODO why is this static?
	public static PerHourEmployee[] perHourEmployees;	
	public static FixedRateEmployee[] fixedRateEmployees;

	public static void main(String[] args) {

		perHourEmployees = new PerHourEmployee[3];
        //TODO don't use cyrillic name in classes, just don't
		perHourEmployees[0] = new PerHourEmployee(0, "Петренко", "Володимир", 25);
		perHourEmployees[1] = new PerHourEmployee(1, "Наказнюк", "Дмитро", 30);
		perHourEmployees[2] = new PerHourEmployee(2, "Павлюк", "Олег", 28);

        //TODO why not use for each loop?
		for(int i=0; i<3; i++) {
			perHourEmployees[i].SalaryPrint();
		}
		
		fixedRateEmployees = new FixedRateEmployee[3];

        //TODO don't use cyrillic name in classes, just don't
        fixedRateEmployees[0] = new FixedRateEmployee(3, "Остапчук", "Галина", 2500);
		fixedRateEmployees[1] = new FixedRateEmployee(4, "Мельник", "Василина", 3000);
		fixedRateEmployees[2] = new FixedRateEmployee(5, "Андрюк", "Оксана", 2800);

        //TODO why not use for each loop?
        for(int i=0; i<3; i++) {
			fixedRateEmployees[i].SalaryPrint();
		}
	}

}
