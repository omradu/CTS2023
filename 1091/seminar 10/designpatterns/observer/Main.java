public class Main {
    public static void main(String[] args) {
        BursaValori bursaValori = new BursaValori();

        Investitor investitor = new Investitor("Vasile");
        AplicatieBursa aplicatieBursa = new AplicatieBursa();

        bursaValori.subscribeObservator(investitor);
        bursaValori.subscribeObservator(aplicatieBursa);
        bursaValori.notificaObservatori("AAPL", 100);
        bursaValori.notificaObservatori("AAPL", 98);
        
        bursaValori.unsubscribeObservator(investitor);
        bursaValori.notificaObservatori("AAPL", 188);
    }
}
