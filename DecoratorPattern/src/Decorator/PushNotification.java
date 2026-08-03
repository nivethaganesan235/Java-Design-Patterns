package Decorator;

public class PushNotification extends NotificationDecorator {
	public PushNotification(Notification notification,NotificationHistory history) {
        super(notification,history);
    }

    public void send(PlacementDetails details) {

        notification.send(details);

        System.out.println(" Placement Portal Updated");
        history.add("Placement Portal Updated");
    }

}
