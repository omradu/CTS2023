public class PurchaseOrder extends Order{
    private Broker broker;

    public PurchaseOrder(Broker broker,int nbStocks) {
        super(nbStocks);
        this.broker = broker;
    }

    @Override
    void executeOrder(int nbStocks) {
        broker.executeOrder(this.nbStocks);
    }
}
