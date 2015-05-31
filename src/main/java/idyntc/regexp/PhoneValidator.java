package idyntc.regexp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * validates phone numbers using phone number pattern
 */
public class PhoneValidator {
    private static final String PHONE_NUMBER_PATTERN = "(\\(?\\d{3}\\)?)(\\.?\\-?\\s?\\d{3}\\.?\\-?\\s?)(\\d{4})";

    /**
     * this method validates phone numbers using pattern
     *
     * @param phoneNumbers         - examples of correct phone number
     * @param PHONE_NUMBER_PATTERN - regular expressions for validate phone number
     * @return true or false
     */

    public static boolean phoneValidate(final String phoneNumbers, final String PHONE_NUMBER_PATTERN) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(phoneNumbers);
        return matcher.matches();
    }

    public static void main(String[] args) {
        List<String> phoneNumbersList = new ArrayList<>();

        phoneNumbersList.add(0, "(123) 456 7899");
        phoneNumbersList.add(1, "(123).456.7899");
        phoneNumbersList.add(2, "(123)-456-7899");
        phoneNumbersList.add(3, "123-456-7899");
        phoneNumbersList.add(4, "123 456 7899");
        phoneNumbersList.add(5, "1234567899");

        for (int i = 0; i < phoneNumbersList.size() ; i++) {
            System.out.println(phoneValidate(phoneNumbersList.get(i), PHONE_NUMBER_PATTERN));
        }
    }
}
