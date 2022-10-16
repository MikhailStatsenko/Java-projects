package Task17_18;

public class Main {
    public static void main(String[] args) {
        RegexChecker rc = new RegexChecker();
        String regex1 = "^abcdefghijklmnopqrstuv18340$";
        System.out.println(rc.check(regex1, "abcdefghijklmnopqrstuv18340")); // true
        System.out.println(rc.check(regex1, "abcdefghijklmnoasdfasdpqrstuv18340")); // false

        String regex2 = "^(([a-fA-F0-9]{2}[:-]){5}[a-fA-F0-9]{2})$";
        System.out.println(rc.check(regex2, "aE:dC:cA:56:76:54")); // true
        System.out.println(rc.check(regex2, "01:23:45:67:89:Az")); // false

        String regex3 = "^\\d+([.,]\\d\\d?)? (USD)|(RUR)|(EU)$";
        System.out.println(rc.check(regex3, "23.78 USD")); // true
        System.out.println(rc.check(regex3, "22 UDD")); // false
        System.out.println(rc.check(regex3, "0.002 USD.")); // false
    }
}
