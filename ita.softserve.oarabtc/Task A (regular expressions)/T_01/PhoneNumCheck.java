/**
 * Created by Olia on 02.05.2015.
 */


import java.util.regex.*;

public class PhoneNumCheck {

    public static void main (String[] args) {

        Pattern p = Pattern.compile("(\\(?\\d{3})?[\\s|.|-]?\\d{3}[\\s|.|-]?\\d{3}");
        Matcher m = p.matcher("(123.456-789");
        boolean res = m.matches();
        System.out.println(res);
    }
}
