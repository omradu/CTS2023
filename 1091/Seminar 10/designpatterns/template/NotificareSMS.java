public class NotificareSMS extends TemplateNotificare{
    @Override
    public void pregatireNotificare() {
        System.out.println("Se pregateste notificarea SMS");
    }

    @Override
    public String creareMesaj() {
        return "Mesaj notificare SMS";
    }

    @Override
    public void trimiteMesajul(String mesaj) {
        System.out.println("Se trimite " + mesaj);
    }
}
