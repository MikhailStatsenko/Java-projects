package Task1;

public class TestBall {
    public static void main(String[] args) {
        Ball firstBall = new Ball();
        Ball secondBall = new Ball("foot");
        Ball thirdBall = new Ball(50);
        Ball fourthBall = new Ball("basket", 70);

        secondBall.setWeight(90);
        thirdBall.setColor("volleyball");
        System.out.println(firstBall);
    }
}
