package sazartc.regexp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersExtractor {
	
	private String inputString;
	
	NumbersExtractor(String inputString) {
		this.inputString = inputString;
	}
	
	public void setInputString(String inputString) {
		this.inputString = inputString;
	}
	
	public List<String> check() {
		
        Pattern pattern = Pattern.compile("\\d+\\.?\\d*");
        Matcher matcher = pattern.matcher(this.inputString);        
        
        List<String> groups = new ArrayList<String>();
        while (matcher.find()) {
        	groups.add(matcher.group());
		}
        
      	return groups;        
	}

	@Override
	public String toString() {		
		return this.inputString;
	}
	
}

 
