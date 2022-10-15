package Task10.Ex2;

public class Client {
    private String name;
    Client(String name) {
        this.name = name;
    }
    public void sitChair(Chair chair){
        System.out.println(this.name + " сидит на стуле " + chair.getChairType());
    }

    public static void main(String[] args) {
        Client cl = new Client("Виталий");
        ChairFactory factory = new ChairFactory();
        Chair ch = factory.createMagicChair();
        cl.sitChair(ch);
    }
}
