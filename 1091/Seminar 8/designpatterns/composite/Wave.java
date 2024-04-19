import java.util.ArrayList;

public class Wave extends InamicAbstract {

    ArrayList<InamicAbstract> inamici = new ArrayList<>();

    public Wave(String nume) {
        
        super(nume);
    }

    @Override
    public void ataca(int damage) {
        System.out.println(this.nume + " ataca");
        for(InamicAbstract inamic : this.inamici) {
            inamic.ataca(damage);
        }
    }

    @Override
    public void seApara() {
        for(InamicAbstract inamic : this.inamici) {
            inamic.seApara();
        }
    }

    @Override
    public void seVindeca() {
        for(InamicAbstract inamic : this.inamici) {
            inamic.seVindeca();
        }
    }

    @Override
    public void adaugaInamic(InamicAbstract nod) {
        this.inamici.add(nod);
    }

    @Override
    public void stergeInamic(int index) {
        if(index>=0 && index<inamici.size()) {
            System.out.println("Inamicul " + this.inamici.get(index).getNume() + " a fost sters");
            this.inamici.remove(index);
        }

    }

    @Override
    public InamicAbstract getInamic(String nume) {
        InamicAbstract referinta = null;
        for(InamicAbstract inamic :inamici)
            if(inamic.getNume().equals(nume))
                referinta = inamic;

        return referinta;
    }
}
