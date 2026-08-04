package factorymethod;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

	        System.out.println("====================================");
	        System.out.println("       COLLEGE REPORT SYSTEM");
	        System.out.println("====================================");
	        
	        
	        
	        System.out.print("Enter Student ID: ");
	        int id = sc.nextInt();
	        while(id <= 0) {
	            System.out.println("Invalid ID. Enter positive value.");
	            System.out.print("Enter Student ID: ");
	            id = sc.nextInt();
	        }
	        sc.nextLine();


	        System.out.print("Enter Student Name: ");
	        String name = sc.nextLine();


	        System.out.print("Enter Branch: ");
	        String branch = sc.nextLine();


	        System.out.print("Enter Company: ");
	        String company = sc.nextLine();


	        System.out.print("Enter Role: ");
	        String role = sc.nextLine();


	        System.out.print("Enter CGPA: ");
	        double cgpa = sc.nextDouble();
	        while(cgpa < 0 || cgpa > 10) {
	            System.out.println("Invalid CGPA. Enter value between 0 and 10.");
	            System.out.print("Enter CGPA: ");
	            cgpa = sc.nextDouble();
	        }


	        System.out.print("Enter Attendance Percentage: ");
	        double attendance = sc.nextDouble();
	        while(attendance < 0 || attendance > 100) {
	            System.out.println("Invalid Attendance. Enter value between 0 and 100.");
	            System.out.print("Enter Attendance Percentage: ");
	            attendance = sc.nextDouble();
	        }
	        
	        
	        System.out.print("Placement Status (true/false): ");
	        boolean placementStatus = sc.nextBoolean();


	        Student student = new Student(
	                id,
	                name,
	                branch,
	                cgpa,
	                attendance,
	                placementStatus,
	                company,
	                role
	        );



	        while(true)
	        {
	        	System.out.println("\nSelect Report Type");
		        System.out.println("------------------------------------");
		        System.out.println("1. Student Academic Report");
		        System.out.println("2. Attendance Report");
		        System.out.println("3. Placement Report");
		        System.out.println("4. Generate All Reports");
		        System.out.println("5.Exit");

		        System.out.print("\nEnter choice: ");
		        int choice = sc.nextInt();

		        ReportFactory factory;
		        Report report;

	        switch(choice) {

	            case 1:
	                factory = new StudentReportFactory();
	                report = factory.createReport();
	                report.generateReport(student);
	                break;

	            case 2:
	                factory = new AttendanceReportFactory();
	                report = factory.createReport();

                    report.generateReport(student);
	                break;
	                
	            case 3:
	                factory = new PlacementReportFactory();
	                report = factory.createReport();

                    report.generateReport(student);
	                break;
	                
	            case 4:

                    System.out.println("\nGenerating All Reports...");


                    factory = new StudentReportFactory();
                    report = factory.createReport();
                    report.generateReport(student);



                    factory = new AttendanceReportFactory();
                    report = factory.createReport();
                    report.generateReport(student);



                    factory = new PlacementReportFactory();
                    report = factory.createReport();
                    report.generateReport(student);


                    break;
	            case 5:

                    System.out.println("Exiting Report System...");
                    sc.close();
                    System.exit(0); 


	            default:
	                System.out.println("Invalid choice");
	                sc.close();
	                return;
	        }
	        }


	}

}
