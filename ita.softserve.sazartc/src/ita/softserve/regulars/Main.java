package ita.softserve.regulars;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {		
		
		ArrayList<PhoneNumber> phones = new ArrayList<PhoneNumber>();		
		phones.add(new PhoneNumber("(123) 456 7899"));
		phones.add(new PhoneNumber("(123).456.7899"));
		phones.add(new PhoneNumber("(123)-456-7899"));
		phones.add(new PhoneNumber("123-456-7899"));
		phones.add(new PhoneNumber("123 456 7899"));
		phones.add(new PhoneNumber("1234567899"));
		phones.add(new PhoneNumber("test"));
		phones.add(new PhoneNumber("123 ooopps..."));
		phones.add(new PhoneNumber("456 789 ()"));
		phones.add(new PhoneNumber(".123.456789"));
		
		for(PhoneNumber pn: phones) {
			System.out.printf("%s: ", pn.toString());
			System.out.println(pn.check());
		}

	}

}
