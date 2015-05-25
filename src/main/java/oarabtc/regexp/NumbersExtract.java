package oarabtc.regexp; /**
 * Created by Olia on 03.05.2015.
 */

import java.util.ArrayList;
import java.util.regex.*;
//TODO rename
public class NumbersExtract {

    //TODO rename
    public static ArrayList<String> textCheck(String text) {

        Pattern textPattern = Pattern.compile("\\d*\\.?\\d+");
        Matcher textMatcher = textPattern.matcher(text);
        //TODO rename
        boolean resText = textMatcher.find();

        ArrayList<String> textResult = new ArrayList<>();

        while (textMatcher.find()) {
            textResult.add(textMatcher.group());
        }
        if (textResult.isEmpty()) {
            return null;
        } else {
            return textResult;
        }
    }

    public static void main(String[] args) {

        String text1 = "2 Carrots (3.14 high) have fun 4ever times, even at 11 p.m.";
        String text2 = "Broccoli seriously men, don't have fun";

        System.out.println("Numbers of text #1: " + textCheck(text1));
        System.out.println("Numbers of text #2: " + textCheck(text2));
    }
}