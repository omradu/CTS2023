public abstract class InamicAbstract {

    protected String nume;

    public InamicAbstract(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    //metode specifice inamicilor (noduri frunze)
    public abstract void ataca(int damage);
    public abstract void seApara();
    public abstract void seVindeca();

    //metode specifice nodurilor composite
    public abstract void adaugaInamic(InamicAbstract nod);
    public abstract void stergeInamic(int index);
    public abstract InamicAbstract getInamic(String nume);
}
