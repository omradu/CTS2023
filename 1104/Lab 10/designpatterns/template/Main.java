public class Main {
    public static void main(String[] args) {
        NotificationTemplate pushNotification = new PushNotification();
        NotificationTemplate SMSNotification = new SMSNotification();
        NotificationTemplate emailNotification = new EmailNotification();

        pushNotification.sendNotification();
        SMSNotification.sendNotification();
        emailNotification.sendNotification();
    }
}
