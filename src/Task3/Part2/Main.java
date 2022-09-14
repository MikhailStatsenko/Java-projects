package Task3.Part2;

public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0, 0, 5, 7, 10);
        circle.moveUp();
        circle.moveUp();
        circle.moveLeft();
        System.out.println(circle);
        circle.moveRight();
        circle.moveRight();
        circle.moveDown();
        System.out.println(circle);

        MovableRectangle rectangle = new MovableRectangle(0, 0, 4, 2, 3, 4);
        rectangle.moveDown();
        rectangle.moveRight();
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
