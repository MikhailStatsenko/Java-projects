package Task12_15.Ex4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static String formatNumber(String number){
        String regex = "(\\+\\d{0,3}|8)(\\d{3})(\\d{3})(\\d{4})$";
        if (!number.matches(regex)){
            throw new Error("Неверный формат номера");
        } else {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(number);
            matcher.find();

            return ((matcher.group(1).equals("8")) ? "+7" : matcher.group(1))+
                    matcher.group(2) + "-" + matcher.group(3) + "-" + matcher.group(4);
        }
    }
}
