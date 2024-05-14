public class AplicatieBursa implements ObservatorBursa{
    @Override
    public void updatePret(String simbol, double pret) {
        System.out.println("Pretul pentru  " + simbol + " este acum: $" + pret);
    }
}
