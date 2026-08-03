package Decorator;

public class PlacementNotification implements Notification {
	@Override
    public void send(PlacementDetails details) {

        System.out.println("====================================");
        System.out.println("   COLLEGE PLACEMENT NOTIFICATION");
        System.out.println("====================================");
        System.out.println();

        System.out.println("Student Details");
        System.out.println("------------------------------------");

        System.out.println("ID       : " + details.student.studentId);
        System.out.println("Name     : " + details.student.name);
        System.out.println("Branch   : " + details.student.branch);
        System.out.println("Email    : " + details.student.email);
        System.out.println();

        System.out.println("Company : " + details.company);
        System.out.println("Role    : " + details.role);
        System.out.println("Location: " + details.location);
        System.out.println("Date    : " + details.date);
        System.out.println("Priority : " + details.priority);

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Notification Channels");
        System.out.println("------------------------------------");
    }

}
