import java.util.ArrayList;
import java.util.regex.*;


public class NumbersInTextCheck {


    public static ArrayList<String> numbersInTextCheck(String text) {

        Pattern textPattern = Pattern.compile("\\d*\\.?\\d+");
        Matcher textMatcher = textPattern.matcher(text);


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

        System.out.println("Numbers of text #1: " + numbersInTextCheck(text1));
        System.out.println("Numbers of text #2: " + numbersInTextCheck(text2));
    }
}