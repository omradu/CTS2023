public class Main {
    public static void main(String[] args) {
        BrokerApp brokerApp = new BrokerApp();
        Broker broker = new Broker();
        brokerApp.addOrder(new PurchaseOrder(broker, 10));
        brokerApp.addOrder(new PurchaseOrder(broker, 25));
        brokerApp.addOrder(new SellOrder(broker, 5));
        brokerApp.sendOrderToExecute();

    }
}
