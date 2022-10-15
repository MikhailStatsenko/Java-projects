package Task10.Ex2;

public class VictorianChair implements Chair{
    int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public void showChairAge() {
        System.out.println("Стулу уже "+age+" лет.");
    }

    @Override
    public String getChairType() {
        return "Victorian Chair";
    }
}
