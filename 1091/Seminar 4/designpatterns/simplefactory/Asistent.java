package designpatterns.simplefactory;

public class Asistent extends PersonalSpital{
    public Asistent(String nume, float salariu) {
        super(nume, salariu);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent: ");
        sb.append(super.toString());
        return sb.toString();
    }
}
