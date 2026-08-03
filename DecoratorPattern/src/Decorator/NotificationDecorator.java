package Decorator;

public abstract class NotificationDecorator implements Notification {
	protected Notification notification;
	protected NotificationHistory history;

    public NotificationDecorator(Notification notification,NotificationHistory history) {
        this.notification = notification;
        this.history = history;
    }

	

}
