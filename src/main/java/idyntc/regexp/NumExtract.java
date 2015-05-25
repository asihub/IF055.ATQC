package idyntc.regexp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class NumExtract {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d*\\.?\\d+");
        Matcher matcher = pattern.matcher("Hello 2.15 digital World 5,3");

        List<String> numbers=new ArrayList<String>();

        while (matcher.find()){
            numbers.add(matcher.group());
        }
        if (numbers.isEmpty()){
            System.out.println("There are no numbers in this string");
        }else {
            System.out.println("Numbers from this string: " +numbers);
        }

    }
}





