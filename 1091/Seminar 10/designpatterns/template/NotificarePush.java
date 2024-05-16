public class NotificarePush extends TemplateNotificare{
    @Override
    public void pregatireNotificare() {
        System.out.println("Se pregateste notificarea push");
    }

    @Override
    public String creareMesaj() {
        return "Mesaj notificare push";
    }

    @Override
    public void trimiteMesajul(String mesaj) {
        System.out.println("Se trimite " + mesaj);
    }
}
