package Task3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        width = length = 0;
        filled = false;
        color = "Transparent";
    }

    public Rectangle(double width, double length) {
        this();
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width + length);
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle's color is " + color +
                " and it's " + (filled ? "filled" : "not filled")
                + " The width: " + width + ". The length: " + length ;
    }
}
