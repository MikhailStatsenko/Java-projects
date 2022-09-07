package Task3;

public class Test {
    public static void main(String[] args) {
        Shape shape1 = new Circle("Red", false, 5.5);
        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getColor());
        // Можно вызвать только методы класса Shape, не содержащего getRadius()
        //System.out.println(shape1.getRadius());

        Circle circle = (Circle) shape1;
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getColor());
        System.out.println(circle.getRadius());

        //Нельзя создать объект абстрактного класса
        //Shape shape2 = new Shape();

        Shape shape3 = new Rectangle("Red", false, 1.0, 2.0);
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.getColor());
        // Можно вызвать только методы класса Shape, не содержащего getLength()
        //System.out.println(shape3.getLength());

        Rectangle rectangle1 = (Rectangle) shape3;
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.getLength());

        Shape shape4 = new Square(6.6);
        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());
        // Можно вызвать только методы класса Shape, не содержащего getSide()
        //System.out.println(shape4.getSide());

        Rectangle rectangle2 = (Rectangle) shape4;
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getColor());
        // Можно вызвать только методы классов Shape и Rectangle, не содержащие getSide()
        //System.out.println(rectangle2.getSide());
        System.out.println(rectangle2.getLength());

        Square square = (Square) rectangle2;
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getColor());
        System.out.println(square.getSide());
        System.out.println(square.getLength());
    }
}
