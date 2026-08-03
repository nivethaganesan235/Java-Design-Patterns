package Decorator;

public class EmailNotification extends NotificationDecorator {
	public EmailNotification(Notification notification,NotificationHistory history) {
        super(notification,history);
    }

    public void send(PlacementDetails details) {

        notification.send(details);

        System.out.println(" Email Notification Sent");


        history.add("Email Notification Sent");
    }

}
