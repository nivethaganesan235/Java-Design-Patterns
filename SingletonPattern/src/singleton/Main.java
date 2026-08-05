package singleton;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Only one PlacementCell object
        PlacementCell placementCell = PlacementCell.getInstance();

        while (true) {

            System.out.println("\n====================================");
            System.out.println("     COLLEGE PLACEMENT CELL");
            System.out.println("====================================");
            System.out.println("1. Add Company");
            System.out.println("2. View Companies");
            System.out.println("3. Search Company");
            System.out.println("4. Update Recruitment Status");
            System.out.println("5. Display Singleton Instance");
            System.out.println("6. Exit");

            System.out.print("\nEnter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("\nEnter Company Name : ");
                    String companyName = sc.nextLine();
                    while (companyName.trim().isEmpty()) {

                        System.out.println("Company Name cannot be empty.");

                        System.out.print("Enter Company Name : ");
                        companyName = sc.nextLine();
                    }

                    System.out.print("Enter Role : ");
                    String role = sc.nextLine();

                    while (role.trim().isEmpty()) {

                        System.out.println("Role cannot be empty.");

                        System.out.print("Enter Role : ");
                        role = sc.nextLine();
                    }

                    double packageLPA;

                    while (true) {

                        System.out.print("Enter Package (LPA) : ");
                        packageLPA = sc.nextDouble();

                        if (packageLPA > 0) {
                            break;
                        }
                        System.out.println("Package must be greater than 0.");
                    }

                    sc.nextLine();

                    String status;

                    while (true) {

                        System.out.print("Enter Status (Open/Closed) : ");
                        status = sc.nextLine();

                        if (status.equalsIgnoreCase("Open")
                                || status.equalsIgnoreCase("Closed")) {

                            break;
                        }

                        System.out.println("Status must be Open or Closed.");
                    }

                    Company company = new Company(
                            companyName,
                            role,
                            packageLPA,
                            status);

                    placementCell.addCompany(company);

                    break;
                case 2:

                    placementCell.displayCompanies();

                    break;

                case 3:

                    System.out.print("\nEnter Company ID : ");

                    int searchId=sc.nextInt();

                    placementCell.searchCompany(searchId);

                    break;

                case 4:

                    System.out.print("\nEnter Company ID : ");

                    int updateId=sc.nextInt();
                    sc.nextLine();

                    String newStatus;

                    while (true) {

                        System.out.print("Enter New Status (Open/Closed) : ");

                        newStatus = sc.nextLine();
                        if (newStatus.equalsIgnoreCase("Open")
                                || newStatus.equalsIgnoreCase("Closed")) {

                            break;
                        }

                        System.out.println("Status must be Open or Closed.");
                    }

                    placementCell.updateStatus(updateId, newStatus);

                    break;

                case 5:

                    System.out.println("\nSingleton Demonstration");

                    placementCell.displayInstanceHash();

                    PlacementCell anotherInstance =
                            PlacementCell.getInstance();

                    anotherInstance.displayInstanceHash();

                    if (placementCell == anotherInstance) {

                        System.out.println(
                                "\nBoth references point to the SAME PlacementCell object.");

                    }
                    break;

                case 6:

                    System.out.println("\nThank You!");

                    sc.close();

                    System.exit(0);

                default:

                    System.out.println("\nInvalid Choice.");

            }

        }


	}

}
