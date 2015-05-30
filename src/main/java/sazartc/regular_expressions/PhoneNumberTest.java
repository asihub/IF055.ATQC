package sazartc.regular_expressions;

import sazartc.common_libraries.CsvReader;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberTest {
    public static void main(String[] args) {
        final String PHONE_NUMBERS_FILENAME = "src\\main\\java\\sazartc\\regexp\\resources\\phoneNumbers.csv";
        final String PHONE_NUMBER_PATTERN =
                "((\\d{3})|(\\(\\d{3}\\)))((\\d{3})|(\\.\\d{3}\\.)|(\\-\\d{3}\\-)|(\\s\\d{3}\\s))(\\d{4})";

        Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
        List<String> phoneNumbers = CsvReader.INSTANCE.readFromCsv(PHONE_NUMBERS_FILENAME);
        for (String phoneNumber : phoneNumbers) {
            Matcher matcher = pattern.matcher(phoneNumber);
            System.out.printf("Is Phone number [%15s] correct: %b\n", phoneNumber, matcher.matches());
        }
    }
}


