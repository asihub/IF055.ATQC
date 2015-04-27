import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberCheck {

    public static boolean isPhoneNumberValid(String phoneNumber){
        Pattern pattern = Pattern.compile("(\\(?\\d{3}\\)?[\\s\\.\\-]?){1,2}\\d{4}");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {

        List<String> phoneNumbers = new ArrayList<String>(){{
            add("(123) 456 7899");
            add("(123).456.7899");
            add("(123)-456-7899");
            add("123-456-7899");
            add("123 456 7899");
            add("1234567899");
            add("123456789910");
            add("1234-56-7899");
        }};

        phoneNumbers.forEach(number -> System.out.println(number + " - " + isPhoneNumberValid(number)));

    }

}
