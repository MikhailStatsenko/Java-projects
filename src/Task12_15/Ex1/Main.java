package Task12_15.Ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fio = sc.nextLine();

        String[] data = fio.trim().split("[^a-zA-Zа-яА-ЯёЁ]+");

        Person pers1 = null;
        if (data.length == 3) {
            pers1 = new Person(data[0], data[1], data[2]);
        } else if (data.length == 2) {
            pers1 = new Person(data[0], data[1]);
        } else if (data.length == 1) {
            pers1 = new Person(data[0]);
        } else {
            System.out.println("Введены неверные данные");
        }

        if (pers1 != null)
            System.out.println(pers1.getFullName());
//        Person pers1 = new Person(sc.nextLine(), "Ivanov", "Ivanovich");
//        System.out.println(pers1.getFullName());
//
//        Person pers2 = new Person("Ivan", "Ivanov");
//        System.out.println(pers2.getFullName());
//
//        Person pers3 = new Person("Ivan");
//        System.out.println(pers3.getFullName());
    }
}
