public abstract class AbstractFilmBuilder {
    public abstract void addGen(String genul);
    public abstract void areLimitaVarsta();
    public abstract void addRatingIMDB(double rating);
    public abstract void addDurataInMinute(double durata);
    public abstract void addBileteVandute(int ticketsSold);
    public abstract void esteDisponibilIn4D();
    public abstract void addAnProductie(int anProductie);
    public abstract Film build();
}
