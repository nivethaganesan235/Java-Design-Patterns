package Decorator;
import java.util.ArrayList;
public class NotificationHistory {
	ArrayList<String> history = new ArrayList<>();


    public void add(String message) {

        history.add(message);
    }


    public void displayHistory() {

        System.out.println();

        System.out.println("Notification History");
        System.out.println("------------------------------------");

        for(String h : history) {

            System.out.println(" " + h);
        }
    }

}
