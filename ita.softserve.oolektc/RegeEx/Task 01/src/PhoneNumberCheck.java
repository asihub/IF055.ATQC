import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberCheck {

    public static boolean isPhoneNumberValid(String phoneNumber){
        Pattern pattern = Pattern.compile("\\(?\\d{3}\\)?((\\s?\\d{3}\\s?)|(\\.?\\d{3}\\.?)|(\\-?\\d{3}\\-?))\\d{4}");
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
            add("911");
            add("067-56-5412");
            add("(123).456-7899");
            add("http://www.regexr.com");
        }};

        phoneNumbers.forEach(number -> System.out.println(number + " - " + isPhoneNumberValid(number)));

    }

}
