package ita.softserve.regulars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
	
	private String number;
	
	PhoneNumber(String number) {
		this.number = number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public boolean check() {
        Pattern pattern = Pattern.compile("((\\d{3})|(\\(\\d{3}\\)))((\\d{3})|(\\.\\d{3}\\.)|(\\-\\d{3}\\-)|(\\s\\d{3}\\s))(\\d{4})");
        Matcher matcher = pattern.matcher(this.number);        
        return matcher.matches();	
	}

	@Override
	public String toString() {		
		return this.number;
	}
	
	
}

 
