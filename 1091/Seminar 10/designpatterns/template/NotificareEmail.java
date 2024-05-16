public class NotificareEmail extends TemplateNotificare{
    @Override
    public void pregatireNotificare() {
        System.out.println("Se pregateste notificarea email");
    }

    @Override
    public String creareMesaj() {
        return "Mesaj notificare email";
    }

    @Override
    public void trimiteMesajul(String mesaj) {
        System.out.println("Se trimite " + mesaj);
    }
}
