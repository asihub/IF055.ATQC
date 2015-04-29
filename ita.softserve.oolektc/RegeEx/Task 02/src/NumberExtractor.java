import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractor {

    public static String stringWithNumbers = "Lorem 2.15 ipsum 5,3,45 dolor 5,7 sit amet,3rd consectetur adipiscing 15th";
    public static String stringWithoutNumbers = "Lorem ipsum dolor sit amet,consectetur adipiscing";

    public static void main(String[] args) {

        System.out.println(extractNumbers(stringWithNumbers));
        System.out.println(extractNumbers(stringWithoutNumbers));

    }

    public static List extractNumbers(String string) {
        Pattern pattern = Pattern.compile("\\d*\\.?\\d+");
        Matcher matcher = pattern.matcher(string);

        List<String> listOfNumbers = new ArrayList<>();

        while (matcher.find()) {
            listOfNumbers.add(matcher.group());
        }

        if (listOfNumbers.isEmpty()){
            return null;
        } else {
            return listOfNumbers;
        }
    }
}
