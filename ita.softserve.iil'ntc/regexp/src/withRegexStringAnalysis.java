import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class withRegexStringAnalysis {

    public static void main (String [] args) {

        String givenString = "Hello 2222.2222.15 digital World7&5, >0 .3??,2.0";
        System.out.println("List of numbers " +
                ((extractListOfNumbers(givenString)==null)? "is empty." :
                        "has next numbers: " + extractListOfNumbers(givenString)));
    }

    public static LinkedList extractListOfNumbers(String givenString){

        LinkedList <String> listOfNumbers = new LinkedList<>();

        Pattern reTemplate = Pattern.compile("\\d*\\.?\\d+");
        Matcher putGivenString = reTemplate.matcher(givenString);

        while (putGivenString.find()){
            listOfNumbers.add(putGivenString.group());
        }
        if (listOfNumbers.isEmpty()){
            return null;
        }else{
            return listOfNumbers;
        }

    }

}
