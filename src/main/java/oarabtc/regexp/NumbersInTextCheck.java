package oarabtc.regexp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class NumbersInTextCheck {

    public static List<String> verifyTextNumbers(String text) {

        Pattern textPattern = Pattern.compile("\\d*\\.?\\d+");
        Matcher textMatcher = textPattern.matcher(text);

        List<String> textResult = new ArrayList<>();

        while (textMatcher.find()) {
            textResult.add(textMatcher.group());
        }
        if (textResult.isEmpty()) {
            return null;
        } else {
            return textResult;
        }
    }

    final static String TEXT_WITH_NUMBERS = "2 Carrots (3.14 high) have fun 4ever times, even at 11 p.m.";
    final static String TEXT_WITHOUT_NUMBERS = "Broccoli seriously men, don't have fun";

    public static void main(String[] args) {

        System.out.println("Numbers of text #1: " + verifyTextNumbers(TEXT_WITH_NUMBERS));
        System.out.println("Numbers of text #2: " + verifyTextNumbers(TEXT_WITHOUT_NUMBERS));
    }
}