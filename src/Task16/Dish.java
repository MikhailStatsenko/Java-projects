package Task16;

public final class Dish implements Item {
    private final double price;
    private final String name;
    private final String description;

    public Dish(String name, String description) {
        price = 0;
        this.name = name;
        this.description = description;
    }

    public Dish(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description + " " + name + " " + price;
    }
}
