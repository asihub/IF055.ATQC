package ita.softserve.regulars;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {		
		
		//PhoneNumbers checking
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
		
		System.out.println("Phone number checking:");
		for (PhoneNumber phoneNumber: phones) {
			System.out.printf("%s: ", phoneNumber.toString());
			System.out.println(phoneNumber.check());
		}

		// Numbers extractor checking
		ArrayList<NumbersExtractor> numStrings 
				= new ArrayList<NumbersExtractor>();		
		numStrings.add(new NumbersExtractor("Hello 2.15 digital World 5,3"));
		numStrings.add(new NumbersExtractor(
				"Is 543 there 1.54 2,5 anybody here ?"));

		System.out.println("Numbers extractor checking:");
		List<String> groups = new ArrayList<String>();

		for (NumbersExtractor num_string: numStrings) {

			groups = num_string.check();
				
			for (String group: groups) {				
				System.out.printf("%s, ", group);
			}
			
			System.out.println("");
		}
	}
	
}


