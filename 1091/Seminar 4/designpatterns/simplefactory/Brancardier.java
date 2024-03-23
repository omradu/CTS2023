package designpatterns.simplefactory;

public class Brancardier extends PersonalSpital{

    public Brancardier(String nume, float salariu) {
        super(nume, salariu);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier: ");
        sb.append(super.toString());
        return sb.toString();
    }
}
