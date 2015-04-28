import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReStringAnalysis {
    public static void main (String [] args) {
        LinkedList <String> multipleNumbersArray = new LinkedList<>();
        String givenString = "Hello 2222.2222.15 digital World7&5, >0 .3??,2.0";
        Pattern reTemplate = Pattern.compile("\\d*\\.?\\d+");
        Matcher andString = reTemplate.matcher(givenString);
        while (andString.find()){
            multipleNumbersArray.add(andString.group());
        }
        if (multipleNumbersArray.isEmpty()){
            System.out.println("The string hasn't multiple numbers.");
        }else{
            System.out.println("Our string has next multiple numbers: " + multipleNumbersArray);
        }
    }
}
