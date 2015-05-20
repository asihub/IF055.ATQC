import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberCheck {

    public static boolean isPhoneNumberValid(String phoneNumber){
        final Pattern pattern = Pattern.compile("\\(?\\d{3}\\)?((\\s?\\d{3}\\s?)|(\\.?\\d{3}\\.?)|(\\-?\\d{3}\\-?))\\d{4}");
        final Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {

        final List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("(123) 456 7899");
        phoneNumbers.add("(123).456.7899");
        phoneNumbers.add("(123)-456-7899");
        phoneNumbers.add("123-456-7899");
        phoneNumbers.add("123 456 7899");
        phoneNumbers.add("1234567899");
        phoneNumbers.add("123456789910");
        phoneNumbers.add("911");
        phoneNumbers.add("067-56-5412");
        phoneNumbers.add("(123).456-7899");
        phoneNumbers.add("http://www.regexr.com");

        phoneNumbers.forEach(number -> System.out.println(number + " - " + isPhoneNumberValid(number)));
    }
}
