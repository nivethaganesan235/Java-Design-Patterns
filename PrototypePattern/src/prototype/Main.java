package prototype;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        FormRegistry registry = new FormRegistry();

        ArrayList<AdmissionForm> forms = new ArrayList<>();

        while (true) {

            System.out.println("\n=================================");
            System.out.println(" COLLEGE ADMISSION FORM GENERATOR");
            System.out.println("=================================");
            System.out.println("1. Generate Admission Form");
            System.out.println("2. Display Generated Forms");
            System.out.println("3. Display Available Templates");
            System.out.println("4. Exit");

            System.out.print("\nEnter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("\nEnter Department (ECE/CSE/IT) : ");
                    String department = sc.nextLine();
                    AdmissionForm form = registry.getForm(department);

                    if (form == null) {

                        System.out.println("\nInvalid Department!");
                        break;
                    }

                    int rollNumber;

                    while (true) {

                        System.out.print("Enter Roll Number : ");
                        rollNumber = sc.nextInt();

                        if (rollNumber > 0) {
                            break;
                        }

                        System.out.println("Roll Number must be positive.");
                    }

                    sc.nextLine();

                    String studentName;
                    while (true) {

                        System.out.print("Enter Student Name : ");
                        studentName = sc.nextLine();

                        if (!studentName.trim().isEmpty()) {
                            break;
                        }

                        System.out.println("Student Name cannot be empty.");
                    }

                    form.setRollNumber(rollNumber);
                    form.setStudentName(studentName);

                    forms.add(form);

                    System.out.println("\nAdmission Form Generated Successfully.");

                    break;
                case 2:

                    if (forms.isEmpty()) {

                        System.out.println("\nNo Admission Forms Generated.");

                    } else {

                        System.out.println("\n=================================");
                        System.out.println(" GENERATED ADMISSION FORMS");
                        System.out.println("=================================");

                        for (AdmissionForm admissionForm : forms) {

                            admissionForm.displayForm();
                        }
                    }

                    break;

                case 3:

                    registry.displayTemplates();

                    break;
                case 4:

                    System.out.println("\nThank You!");

                    sc.close();

                    System.exit(0);

                default:

                    System.out.println("\nInvalid Choice!");

            }

        }
                    



	}

}
