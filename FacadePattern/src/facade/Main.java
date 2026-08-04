package facade;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("   COLLEGE ADMISSION PORTAL");
        System.out.println("====================================");

        System.out.print("Enter Student ID      : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name    : ");
        String name = sc.nextLine();

        System.out.print("Enter Branch          : ");
        String branch = sc.nextLine();

        System.out.print("Enter Email           : ");
        String email = sc.nextLine();
        
        System.out.print("Documents Submitted? (yes/no) : ");
        boolean documents = sc.nextLine().equalsIgnoreCase("yes");

        
        System.out.print("Admission Fee Paid? (yes/no) : ");
        boolean feePaid = sc.nextLine().equalsIgnoreCase("yes");

        System.out.print("Hostel Required? (yes/no) : ");
        boolean hostel = sc.nextLine().equalsIgnoreCase("yes");

        

        Student student = new Student(
                id,
                name,
                branch,
                email,
                documents,
                feePaid,
                hostel);

        CollegeAdmissionFacade facade = new CollegeAdmissionFacade();

        facade.admitStudent(student);


        sc.close();

	}

}
