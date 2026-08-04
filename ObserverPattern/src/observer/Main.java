package observer;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        PlacementCell placementCell = new PlacementCell();

        ArrayList<Student> students = new ArrayList<>();


        while (true) {

            System.out.println("\n====================================");
            System.out.println("     COLLEGE PLACEMENT PORTAL");
            System.out.println("====================================");

            System.out.println("1. Register Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Publish Placement Drive");
            System.out.println("4. View Registered Students");
            System.out.println("5. View Student Notifications");
            System.out.println("6. Exit");

            System.out.print("\nEnter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {


            case 1:

                System.out.print("\nEnter Student ID : ");
                int id = sc.nextInt();
                sc.nextLine();


                System.out.print("Enter Student Name : ");
                String name = sc.nextLine();


                Student student = new Student(id, name);


                boolean exists = false;


                for(Student s : students) {

                    if(s.getStudentId() == id) {

                        exists = true;
                        break;
                    }
                }
                if(exists) {

                    System.out.println(
                        "\nStudent already exists.");

                }

                else {

                    students.add(student);

                    placementCell.registerStudent(student);

                }


                break;
            case 2:

                System.out.print(
                    "\nEnter Student ID to Remove : ");

                int removeId = sc.nextInt();


                placementCell.removeStudent(removeId);


                break;



            case 3:


                System.out.print(
                    "\nCompany Name : ");

                String company = sc.nextLine();


                System.out.print(
                    "Role : ");

                String role = sc.nextLine();
                System.out.print(
                        "Package (LPA) : ");

                    double packageLPA = sc.nextDouble();

                    sc.nextLine();


                    System.out.print(
                        "Drive Date : ");

                    String date = sc.nextLine();



                    ArrayList<String> rounds =
                            new ArrayList<>();


                    System.out.print(
                        "Number of Interview Rounds : ");

                    int roundCount = sc.nextInt();

                    sc.nextLine();
                    for(int i = 1; i <= roundCount; i++) {

                        System.out.print(
                            "Enter Round "
                            + i
                            + " : ");

                        rounds.add(sc.nextLine());

                    }


                    PlacementNotification notification =
                            new PlacementNotification(
                                    company,
                                    role,
                                    packageLPA,
                                    date,
                                    rounds
                            );


                    placementCell
                            .publishPlacementDrive(notification);


                    break;
            case 4:

                placementCell.displayStudents();

                break;



            case 5:

                System.out.print(
                    "\nEnter Student ID : ");

                int studentId = sc.nextInt();


                boolean found = false;


                for(Student s : students) {

                    if(s.getStudentId() == studentId) {

                        s.displayNotifications();

                        found = true;

                        break;
                    }
                }
                if(!found) {

                    System.out.println(
                        "\nStudent not found.");

                }


                break;



            case 6:

                System.out.println(
                    "\nExiting Placement Portal...");

                sc.close();

                System.exit(0);


            default:

                System.out.println(
                    "\nInvalid Choice.");
            }

        }


	}

}
