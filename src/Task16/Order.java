package Task16;

import java.util.ArrayList;
import java.util.Collection;

public class Order {
    Collection<Item> order;

    public Order(Collection<Item> order) {
        this.order = order;
    }

    public Order() {
        this.order = new ArrayList<>();
    }

    public boolean add(Item item) {
        return order.add(item);
    }

    public boolean remove(Item item) {
        return order.remove(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item i : order){
            sb.append(i).append(", ");
        }
        sb.delete(sb.length()-2, sb.length()-1);
        sb.append("\n");
        return sb.toString();
    }
}
