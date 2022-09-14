package Task3.Part1;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        filled = false;
        color = "Transparent";
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape's color is " + color + " and it's " + (filled ? "filled" : "not filled");
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
