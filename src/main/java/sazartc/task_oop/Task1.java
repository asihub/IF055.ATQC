package sazartc.task_oop;

@Deprecated
//TODO remove
public class Task1 {

	public static void main(String[] args) {

		PerHourEmployee[] perHourEmployees = new PerHourEmployee[3];
		perHourEmployees[0] = new PerHourEmployee(0, "Petrenko", "Volodymyr", 25);
		perHourEmployees[1] = new PerHourEmployee(1, "Nakazniuk", "Dmytro", 30);
		perHourEmployees[2] = new PerHourEmployee(2, "Pavliuk", "Oleh", 28);

		for(PerHourEmployee employee: perHourEmployees) {
			System.out.println(employee.toString());
		}		
		
		FixedRateEmployee[] fixedRateEmployees = new FixedRateEmployee[3];

        fixedRateEmployees[0] = new FixedRateEmployee(3, "Ostapchuk", "Galyna", 2500);
		fixedRateEmployees[1] = new FixedRateEmployee(4, "Melnyk", "Vasylyna", 3000);
		fixedRateEmployees[2] = new FixedRateEmployee(5, "Andriuk", "Oksana", 2800);

		for(FixedRateEmployee employee: fixedRateEmployees) {
			System.out.println(employee.toString());
		}
	}
}
