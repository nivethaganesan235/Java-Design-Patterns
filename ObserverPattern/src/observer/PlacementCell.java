package observer;
import java.util.*;
public class PlacementCell implements Subject {
	private ArrayList<Observer> students;

    private PlacementNotification currentNotification;


    public PlacementCell() {

        students = new ArrayList<>();

    }


    @Override
    public void registerStudent(Observer observer) {

        Student student = (Student) observer;

        for (Observer existing : students) {

            Student existingStudent = (Student) existing;

            if (existingStudent.getStudentId() 
                    == student.getStudentId()) {

                System.out.println("\nStudent already registered.");

                return;
            }
        }
        students.add(observer);

        System.out.println("\nStudent registered successfully.");

    }


    @Override
    public void removeStudent(int studentId) {


        for (Observer observer : students) {

            Student student = (Student) observer;


            if (student.getStudentId() == studentId) {

                students.remove(observer);

                System.out.println("\nStudent removed successfully.");

                return;
            }
        }


        System.out.println("\nStudent not found.");

    }
    public void publishPlacementDrive(
            PlacementNotification notification) {


        currentNotification = notification;


        System.out.println("\nNew Placement Drive Published!");

        notifyStudents();

    }



    @Override
    public void notifyStudents() {


        if (students.isEmpty()) {

            System.out.println(
                "No registered students. Notification not sent.");

            return;
        }
        for (Observer student : students) {

            student.update(currentNotification);

        }

    }



    public void displayStudents() {


        if (students.isEmpty()) {

            System.out.println("\nNo Registered Students.");

            return;
        }


        System.out.println("\n================================");
        System.out.println("REGISTERED STUDENTS");
        System.out.println("================================");
        for (Observer observer : students) {

            Student student = (Student) observer;

            System.out.println(
                student.getStudentId()
                + " - "
                + student.getStudentName()
            );
        }
    }


}
