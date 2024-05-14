public class Main {
    public static void main(String[] args) {
        AplicatieBroker aplicatieBroker = new AplicatieBroker();
        Broker broker = new Broker();
        aplicatieBroker.adaugareOrdin(new OrdinCumparare(broker, 10));
        aplicatieBroker.adaugareOrdin(new OrdinVanzare(broker, 5));
        aplicatieBroker.adaugareOrdin(new OrdinCumparare(broker, 15));
        aplicatieBroker.trimiteOrdineSpreExecutie();
    }
}
