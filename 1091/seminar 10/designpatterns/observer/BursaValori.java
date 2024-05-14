public class BursaValori {
    ArrayList<ObservatorBursa> observatoriBursa = new ArrayList<>();

    public void subscribeObservator(ObservatorBursa observator) {
        this.observatoriBursa.add(observator);
    }

    public void unregisterObserver(ObservatorBursa observator) {
        this.observatoriBursa.remove(observator);
    }

    public void notifyObservers(String simbol, double pret) {
        for(ObservatorBursa observator : observatoriBursa) {
            observator.updatePret(simbol, pret);
        }
    }
}
