import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBookCheckingClass {
    public static void main (String [] args) {

        Pattern reTemplate = Pattern.compile("^(\\(?\\d{3}\\)?)([\\s\\.\\-]?\\d{3}){2}\\d");
        TreeMap<Integer, String> myPhoneBook = new TreeMap<>();
        myPhoneBook.put(1, "123?123?7777");
        myPhoneBook.put(2, "(123) 456 7899");
        myPhoneBook.put(3, "(123).456.7899");
        myPhoneBook.put(4, "(123)-456-7899");
        myPhoneBook.put(5, "123-456-7899");
        myPhoneBook.put(6, "123 456 7899");
        myPhoneBook.put(7, "123.456.7899");
        myPhoneBook.put(8, "1234567899");
        myPhoneBook.put(9, "fu*k");
        myPhoneBook.put(10, "HNY");
        myPhoneBook.put(11, "www.google.com.ua");
        myPhoneBook.put(12, "(123)x456x7899");

        for (Map.Entry<Integer, String> phoneNumber : myPhoneBook.entrySet()) {
            Matcher andPhoneNumberExample = reTemplate.matcher(phoneNumber.getValue());
            System.out.println(phoneNumber.getKey() + " number - " + phoneNumber.getValue() + " - " + andPhoneNumberExample.matches() + " number.");
        }
    }
}
