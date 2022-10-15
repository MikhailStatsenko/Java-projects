package Task12_15.Ex1;

public class Main {
    public static void main(String[] args) {
        Person pers1 = new Person("Ivan", "Ivanov", "Ivanovich");
        System.out.println(pers1.getFullName());

        Person pers2 = new Person("Ivan", "Ivanov");
        System.out.println(pers2.getFullName());

        Person pers3 = new Person("Ivan");
        System.out.println(pers3.getFullName());
    }
}
