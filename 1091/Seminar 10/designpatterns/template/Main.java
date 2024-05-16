public class Main {
    public static void main(String[] args) {
        TemplateNotificare notificarePush = new NotificarePush();
        TemplateNotificare notificareSMS = new NotificareSMS();
        TemplateNotificare notificareEmail = new NotificareEmail();

        notificarePush.trimiteNotificare();
        notificareEmail.trimiteNotificare();
        notificareSMS.trimiteNotificare();
    }
}
