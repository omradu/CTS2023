import java.util.ArrayList;
import java.util.List;

public class BrokerApp {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void sendOrderToExecute() {
        for(Order order : orders) {
            order.executeOrder(order.nbStocks);
        }
    }
}
