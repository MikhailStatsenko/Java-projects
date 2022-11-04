package Task16;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.add(new Dish(10, "California", "sushi"));
        order.add(new Drink(8, "Coca-cola", "Soda"));
        Dish hamburger= new Dish("Hamburger", "Burger");
        order.add(hamburger);
        order.add(new Drink("Tea", "Hot beverage"));

        System.out.println(order);
        order.remove(hamburger);
        System.out.println(order);
    }
}
