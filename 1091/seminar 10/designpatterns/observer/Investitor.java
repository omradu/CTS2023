public class Investitor implements ObservatorBursa{
    String nume;

    public Investitor(String nume) {
        this.nume = nume;
    }

    @Override
    public void updatePret(String simbol, double pret) {
        System.out.println("Buna " + this.nume + ", pretul pentru " + simbol + " este acum: $" + pret);
    }
}
