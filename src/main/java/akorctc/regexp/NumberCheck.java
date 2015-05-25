package akorctc.regexp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberCheck {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\d*\\.?\\d+");
        Matcher matcher = pattern.matcher
                ("Lorem 2.15 ipsum 5,3,45 dolor 5,7 sit amet,3rd consectetur adipiscing 15th");

        List<String> numbers = new ArrayList<>();

        while (matcher.find()){
            numbers.add(matcher.group());
        }

        System.out.println(numbers);

    }
}
