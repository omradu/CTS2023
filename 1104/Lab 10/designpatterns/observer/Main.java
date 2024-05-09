public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Investor investor = new Investor("Marcel");
        BrokerApp app = new BrokerApp();

        stockMarket.registerObserver(investor);
        stockMarket.registerObserver(app);

        stockMarket.notifyObservers("AAPL", 100);
        stockMarket.notifyObservers("AMZN", 188);

        stockMarket.unregisterObserver(investor);
        stockMarket.notifyObservers("AAPL", 120);
    }
}
