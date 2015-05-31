package idyntc.regexp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractor {
    private static final String NUMBER_PATTERN = "\\d*\\.?\\d+";

    public void numberExtract(String text) {
        List<String> numbersList = new ArrayList<>();

        Pattern pattern = Pattern.compile(NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            numbersList.add(matcher.group());
        }
        if (numbersList.isEmpty()) {
            System.out.println("There are no numbers in this string");
        } else {
            System.out.println("Numbers from this string: " + numbersList);
        }
    }

    public static void main(String[] args) {
        NumberExtractor numberExtractor = new NumberExtractor();
        numberExtractor.numberExtract("Hello 2.15 digital World 5,3");
    }
}








