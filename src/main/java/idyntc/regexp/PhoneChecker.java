package idyntc.regexp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PhoneChecker {
    public static void main(String[] args) {
        String reg_exp_pattern = "(\\(?\\d{3}\\)?)(\\.?\\-?\\s?\\d{3}\\.?\\-?\\s?)(\\d{4})";
        List<String> phoneNumbers = new ArrayList<String>();

        phoneNumbers.add(0, "(123) 456 7899");
        phoneNumbers.add(1, "(123).456.7899");
        phoneNumbers.add(2, "(123)-456-7899");
        phoneNumbers.add(3, "123-456-7899");
        phoneNumbers.add(4, "123 456 7899");
        phoneNumbers.add(5, "1234567899");


        for (int i = 0; i < phoneNumbers.size(); i++) {
            System.out.println(phoneValidate(phoneNumbers.get(i), reg_exp_pattern));
        }
    }

    /**
     * this method validates phone numbers using pattern
     *
     * @param phoneNumbers    - examples of correct phone number
     * @param reg_exp_pattern -
     * @return true or false
     */

    public static boolean phoneValidate(String phoneNumbers, String reg_exp_pattern) {
        Pattern pattern = Pattern.compile(reg_exp_pattern);
        Matcher matcher = pattern.matcher(phoneNumbers);
        return matcher.matches();
    }
}
