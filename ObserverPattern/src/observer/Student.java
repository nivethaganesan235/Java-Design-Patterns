package observer;
import java.util.*;
public class Student implements Observer {
	private int studentId;
    private String studentName;
    private ArrayList<PlacementNotification> inbox;

    public Student(int studentId, String studentName) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.inbox = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public void update(PlacementNotification notification) {

        inbox.add(notification);

        System.out.println("\n--------------------------------------");
        System.out.println("Notification for : " + studentName);
        System.out.println("--------------------------------------");

        notification.displayNotification();
    }
    public void displayNotifications() {

        if (inbox.isEmpty()) {

            System.out.println("\nNo Notifications Available.");
            return;
        }

        System.out.println("\n======================================");
        System.out.println("Notifications for " + studentName);
        System.out.println("======================================");

        for (int i = 0; i < inbox.size(); i++) {

            System.out.println("\nNotification " + (i + 1));

            inbox.get(i).displayNotification();

            System.out.println("--------------------------------------");
        }
    }

}
