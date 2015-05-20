import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractor {

    public static String stringWithNumbers = "Lorem 2.15 ipsum 5,3,45 dolor 5,7 sit amet,3rd consectetur adipiscing 15th";
    public static String stringWithoutNumbers = "Lorem ipsum dolor sit amet,consectetur adipiscing";

    public static void main(String[] args) {

        System.out.println(extractNumbersFrom(stringWithNumbers));
        System.out.println(extractNumbersFrom(stringWithoutNumbers));

    }

    public static List extractNumbersFrom(String string) {
        final Pattern pattern = Pattern.compile("\\d*\\.?\\d+");
        final Matcher matcher = pattern.matcher(string);

        final List<String> listOfNumbers = new ArrayList<>();

        while (matcher.find()) {
            listOfNumbers.add(matcher.group());
        }

        if (listOfNumbers.isEmpty()) {
            return null;
        } else {
            return listOfNumbers;
        }
    }
}
