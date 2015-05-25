package idyntc.regexp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PhoneChecker {
    public static void main(String[] args) {

        List<String> phoneNumbers = new ArrayList<String>();

        phoneNumbers.add(0,"(123) 456 7899");
        phoneNumbers.add(1,"(123).456.7899");
        phoneNumbers.add(2,"(123)-456-7899");
        phoneNumbers.add(3,"123-456-7899");
        phoneNumbers.add(4,"123 456 7899");
        phoneNumbers.add(5,"1234567899");

        //TODO code convention
        for (int i=0;i<phoneNumbers.size();i++) {
            System.out.println(phoneValidator(phoneNumbers.get(i)));
        }
    }

    /**
     * this method validates phone numbers using pattern
     * @param phoneNumbers - examples of correct phone number
     * @return true or false
     */
    //TODO code convention
    public static boolean phoneValidator(String phoneNumbers){
        Pattern pattern = Pattern.compile("(\\(?\\d{3}\\)?)(\\.?\\-?\\s?\\d{3}\\.?\\-?\\s?)(\\d{4})");
        Matcher matcher = pattern.matcher(phoneNumbers);
        return matcher.matches();
    }
}
