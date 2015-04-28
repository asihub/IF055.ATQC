package ita.softserve.sazartc;

public class Main {
	//FIXED TODO why is this static? FIXED
	//My fault, I've used them like data fields of class. Removed

	public static void main(String[] args) {

		PerHourEmployee[] perHourEmployees = new PerHourEmployee[3];
        //FIXED TODO don't use cyrillic name in classes, just don't FIXED
		perHourEmployees[0] = new PerHourEmployee(0, "Petrenko", "Volodymyr", 25);
		perHourEmployees[1] = new PerHourEmployee(1, "Nakazniuk", "Dmytro", 30);
		perHourEmployees[2] = new PerHourEmployee(2, "Pavliuk", "Oleh", 28);

        //FIXED TODO why not use for each loop? FIXED
		for(PerHourEmployee employee: perHourEmployees) {
			System.out.println(employee.toString());
		}		
		
		FixedRateEmployee[] fixedRateEmployees = new FixedRateEmployee[3];

        //FIXED TODO don't use cyrillic name in classes, just don't FIXED
        fixedRateEmployees[0] = new FixedRateEmployee(3, "Ostapchuk", "Galyna", 2500);
		fixedRateEmployees[1] = new FixedRateEmployee(4, "Melnyk", "Vasylyna", 3000);
		fixedRateEmployees[2] = new FixedRateEmployee(5, "Andriuk", "Oksana", 2800);

        //FIXED TODO why not use for each loop? FIXED
		for(FixedRateEmployee employee: fixedRateEmployees) {
			System.out.println(employee.toString());
		}	        
        
	}

}
