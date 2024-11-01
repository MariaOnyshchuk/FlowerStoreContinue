package ua.edu.ucu.delivery;
import ua.edu.ucu.model.Item;
import java.util.List;


public class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        System.out.println("The next items have been sent to you via post: ");
        for (Item item : items) {
            System.out.println(item.getDescription());
        }
    }
}
