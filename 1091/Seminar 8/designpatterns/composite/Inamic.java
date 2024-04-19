public class Inamic extends InamicAbstract{

    public Inamic(String nume) {
        
        super(nume);
    }

    @Override
    public void ataca(int damage) {
        
        System.out.println("        " + this.nume + " ataca cu " +  damage + " damage");
    }

    @Override
    public void seApara() {
        System.out.println("        " + this.nume + " se apara!");
    }

    @Override
    public void seVindeca() {
        
        System.out.println("        " + this.nume + " se vindeca");
    }

    @Override
    public void adaugaInamic(InamicAbstract nod) {
        
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeInamic(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public InamicAbstract getInamic(String nume) {
        
        throw new UnsupportedOperationException();
    }

    @Override
    public String getNume() {
        
        return super.getNume();
    }

}
