package Task12_15.Ex2;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();

        address.separateSplit("Russia, Central, Moscow, Tverskaya, 6, 3, 25");
        System.out.println(address);

        address.separateStringTokenizer("Russia; Central, Moscow... Tverskaya-- 6, 3, 25");
        System.out.println(address);
    }
}
