package Task29_30;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static List<String> useStream(String str) {
        List<String> res = new ArrayList<>();

        Stream
                .of(str.split("[\\p{Punct}\\s]+"))
                .collect(
                        Collectors.groupingBy(String::toLowerCase, Collectors.counting())
                )
                .entrySet()
                .stream()
                .sorted(
                        (elem1, elem2) -> {
                            if (elem1.getValue().equals(elem2.getValue())) {
                                return elem1.getKey().compareTo(elem2.getKey());
                            } else {
                                return elem2.getValue().compareTo(elem1.getValue());
                            }
                        }
                )
                .limit(10)
                .forEach(elem -> res.add(elem.getKey()));

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        useStream(str).forEach(elem -> System.out.println(elem));
    }
}