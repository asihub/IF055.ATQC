import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;

public class PhoneNumberValidation {
	
	public static boolean compareWithTemplate (String phone_number) { 
		Pattern pt = Pattern.compile("[\\(]?\\d{3}[\\)]?[\\s.-]?\\d{3}[\\s.-]?\\d{4}");
		Matcher m = pt.matcher(phone_number);
		return m.matches();
	}	

	public static void main(String[] args) {
				
		List <String> phone_number = new ArrayList<String>();
		
		phone_number.add("(123) 456 7899");  	//true
		phone_number.add("(123).456.7899");  	//true
		phone_number.add("(123)-456-7899");  	//true
		phone_number.add("123-456-7899");    	//true
		phone_number.add("123 456 7899");    	//true
		phone_number.add("1234567899");      	//true  
		phone_number.add("(123) .-456 7899");	//false
		phone_number.add("(123) -.456 7899");	//false
		phone_number.add("(123).- 456 7899");	//false
		phone_number.add("(123 -.456 7899");	//false
		phone_number.add("123) -.456 7899");    //false
		phone_number.add("(9123) 456 7899");	//false
		phone_number.add("(123)) 456 7899"); 	//false
		phone_number.add("((123) 456 7899");	//false
		phone_number.add("(123) (456) (7899)");	//false
		phone_number.add("Andy Worhole");		//false
		
		for (int i=0; i < phone_number.size(); i++){
			System.out.println(compareWithTemplate(phone_number.get(i)));
		}	
	}
}
