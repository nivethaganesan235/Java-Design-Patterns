package Decorator;

public class WhatsAppNotification extends NotificationDecorator {
	public WhatsAppNotification(Notification notification,NotificationHistory history) {
        super(notification,history);
    }

    public void send(PlacementDetails details) {

        notification.send(details);

        System.out.println(" WhatsApp Notification Sent");
        history.add("WhatsApp Notification Sent");
    }

}
