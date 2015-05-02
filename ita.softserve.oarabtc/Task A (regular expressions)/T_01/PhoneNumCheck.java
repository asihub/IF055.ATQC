/**
 * Created by Olia on 02.05.2015.
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;

public class PhoneNumCheck {

    public static boolean phoneNumberCheck (String phoneNumber) {
        Pattern numPattern = Pattern.compile("(\\(?\\d{3})?\\s?|.?|-?\\d{3}\\s?|.?|-?\\d{3}");
        Matcher numMatcher = numPattern.matcher(phoneNumber);
        return numMatcher.matches();
    }
    public  static void main(String[] args) {
        System.out.println("Go");


    }

}
