/**
 * Created by Olia on 03.05.2015.
 */


import java.util.ArrayList;
import java.util.regex.*;


public class PhoneNumCheck {

    public static void main(String[] args) {

        ArrayList<String> phoneNumbers = new ArrayList<String>() {{
            add("(123) 456 7899");
            add("(123).456.7899");
            add("(123)-456-7899");
            add("123-456-7899");
            add("123 456 7899");
            add("1234567899");
            add("phoneNumber");
            add("0502610717");
            add("(0342)787878");
            add("(067))346711");
            add("050)9999888");
            add("re098call");
        }};

        phoneNumbers.forEach(phoneNum -> System.out.println("Number: " + phoneNum + " - is " + phoneNumberCheck(phoneNum)));
    }

    public static boolean phoneNumberCheck(String phoneNumber) {
        Pattern numPattern = Pattern.compile("((\\(\\d{3}\\))|(\\d{3}))[\\s|.|-]?\\d{3}[\\s|.|-]?\\d{4}");
        Matcher numMatcher = numPattern.matcher(phoneNumber);
        return numMatcher.matches();
    }
}
