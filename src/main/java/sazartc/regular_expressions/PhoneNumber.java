package sazartc.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
//TODO remove
public class PhoneNumber {

    private String number;
    private final String phoneNumberPattern =
            "((\\d{3})|(\\(\\d{3}\\)))((\\d{3})|(\\.\\d{3}\\.)|(\\-\\d{3}\\-)|(\\s\\d{3}\\s))(\\d{4})";

    PhoneNumber(String number) {
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isPhoneNumberCorrect() {
        Pattern pattern = Pattern.compile(phoneNumberPattern);
        Matcher matcher = pattern.matcher(this.number);
        return matcher.matches();
    }

    @Override
    public String toString() {
        return this.number;
    }


}

 
