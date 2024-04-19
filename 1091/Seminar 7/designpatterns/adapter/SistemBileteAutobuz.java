public class SistemBileteAutobuz implements SistemBileteAutobuzAbstract{
    private int nrLocuri = 50;
    private int nrLocuriRezervate = 0;

    @Override
    public void rezervaLoc() {
        if(nrLocuriRezervate < nrLocuri) {
            nrLocuriRezervate++;
            System.out.println("Loc rezervat!");
        }
    }
}
