package Task12_15.Ex2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        Address address = new Address();
//
//        Scanner sc = new Scanner(System.in);
//        String addr = sc.nextLine();
//
//        String data = addr.trim();
//        Pattern pattern = Pattern.compile("^([a-zA-Zа-яА-ЯёЁ]+ ){4}(\\d+ ){2}\\d+$");
//        Matcher matcher = pattern.matcher(addr);
//        if(matcher.find()) {
//            address.separateSplit("Russia, Central, Moscow, Tverskaya, 6, 3, 25");
//            System.out.println(address);
//        }
        Address address = new Address();

        address.separateSplit("Russia, Central, Moscow, Tverskaya, 6, 3, 25");
        System.out.println(address);

        address.separateStringTokenizer("Russia; Central, Moscow... Tverskaya-- 6, 3, 25");
        System.out.println(address);
    }
}
