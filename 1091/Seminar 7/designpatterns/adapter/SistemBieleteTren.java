public class SistemBieleteTren implements SistemBileteTrenAbstract {
    private int nrVagoane = 7;
    private int nrLocuriPerVagon = 100;
    private int nrLocuriRezervate = 0;

    @Override
    public void rezervaLoc(int nrVagon, int nrLoc) {
        if(nrVagon>=1 && nrVagon<=nrVagoane) {
            if(nrLoc>=1 && nrLoc<=nrLocuriPerVagon) {
                if(nrLocuriRezervate<700) {
                    System.out.println("Bilet rezervat!");
                    nrLocuriRezervate++;
                }
            }
        }
    }
}
