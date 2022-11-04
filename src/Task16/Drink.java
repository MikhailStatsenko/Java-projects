package Task16;

public final class Drink implements Item {
    private final double price;
    private final String name;
    private final String description;

    public Drink(String name, String description) {
        price = 0;
        this.name = name;
        this.description = description;
    }

    public Drink(double price, String name, String description) {
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
