public class StockMarket {
    ArrayList<StockObserver> stockObservers = new ArrayList<>();

    public void registerObserver(StockObserver stockObserver) {
        this.stockObservers.add(stockObserver);
    }

    public void unregisterObserver(StockObserver stockObserver) {
        this.stockObservers.remove(stockObserver);
    }

    public void notifyObservers(String stockSymbol, double newPrice) {
        for (StockObserver observer : stockObservers) {
            observer.priceUpdate(stockSymbol,newPrice);
        }
    }
}
