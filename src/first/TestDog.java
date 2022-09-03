package first;

public class TestDog {
    public static void main(String[] args) {
        Dog firstDog = new Dog();
        Dog secondDog = new Dog("Bob");
        Dog thirdDog = new Dog(4);
        Dog fourthDog = new Dog("Mike", 5);

        secondDog.setAge(8);
        thirdDog.setName("Helen");
        System.out.println(firstDog);
        fourthDog.intoHumanAge();
    }

}
