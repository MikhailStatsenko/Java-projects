package Task3.Part1;

public class Circle extends Shape{
    protected double radius;

    public  Circle(){
        radius = 0;
        filled = false;
        color = "Transparent";
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle's color is " + color +
                " and it's " + (filled ? "filled." : "not filled.")
                + " The radius: " + radius;
    }
}
