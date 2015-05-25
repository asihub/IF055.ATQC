package shavrytc.RegExpr;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.util.ArrayList;
public class DigitExtractor {

	public static void main(String[] args) {
		
			Pattern pt = Pattern.compile("\\d*\\.?\\d+");
			Matcher m = pt.matcher("One Two 3 4Four 5.point5 six6.5 The7th+million equals 1,2");

	        List <String> digits = new ArrayList<String>();
	        
	        while(m.find()){
	        	digits.add(m.group());
	        }
	        
	        if (digits.isEmpty()){
	        	System.out.println("This string does not contain any digits");
	        	}
	        	else System.out.println( "Found digits:" + digits);
		}

	}

