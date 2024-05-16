public abstract class TemplateNotificare {
    //definim pasii (metodele)
    public abstract void pregatireNotificare();
    public abstract String creareMesaj();
    public abstract void trimiteMesajul(String mesaj);

    //sablonul care trebuie urmat
    public final void trimiteNotificare() {
        pregatireNotificare();
        String mesaj = creareMesaj();
        trimiteMesajul(mesaj);
    }
}
