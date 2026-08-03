package Decorator;

public class SMSNotification extends NotificationDecorator {
	public SMSNotification(Notification notification,NotificationHistory history) {
        super(notification,history);
    }

    public void send(PlacementDetails details) {

        notification.send(details);

        System.out.println(" SMS Reminder Sent");
        history.add("SMS Reminder Sent");
    }

}
