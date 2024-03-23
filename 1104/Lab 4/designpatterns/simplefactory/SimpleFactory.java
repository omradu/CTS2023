package designpatterns.simplefactory;

public class SimpleFactory {
    public static PersonalSpital getPersonal(TipPersonal tipPersonal, String nume, float salariu) {
        switch (tipPersonal) {
            case MEDIC: {
                return new Medic(nume, salariu);
            }
            case ASISTENT: {
                return new Asistent(nume, salariu);
            }
            case BRANCARDIER: {
                return new Brancardier(nume, salariu);
            }
            default:
                throw new IllegalArgumentException("Tipul personalului nu este corect");
        }
    }
}
