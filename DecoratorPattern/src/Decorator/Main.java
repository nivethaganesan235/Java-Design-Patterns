package Decorator;

public class Main {

	public static void main(String[] args) {
		Student student =
		        new Student(
		                "70",
		                "Nivetha",
		                "ECE",
		                "nivetha@gmail.com",
		                "9876543210"
		        );
		PlacementDetails details =
                new PlacementDetails(
                		student,
                        "Salesforce",
                        "Cloud Engineer",
                        "LA",
                        "18-feb-2028",
                        Priority.HIGH
                );


        Notification notification = new PlacementNotification();
        NotificationHistory history = new NotificationHistory();

        notification = new EmailNotification(notification, history);
        notification = new SMSNotification(notification, history);
        notification = new WhatsAppNotification(notification, history);
        notification = new PushNotification(notification, history);


        notification.send(details);
        history.displayHistory();

	}

}
