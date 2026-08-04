package flyweight;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n====================================");
            System.out.println("   COLLEGE MANAGEMENT SYSTEM");
            System.out.println("====================================");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Display Department Cache");
            System.out.println("4. Exit");

            System.out.print("\nEnter Choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("\nEnter Student ID : ");
                    int id = sc.nextInt();

                    while (id <= 0) {
                        System.out.println("Invalid Student ID!");
                        System.out.print("Enter Student ID : ");
                        id = sc.nextInt();
                    }
                    sc.nextLine();

                    System.out.print("Enter Student Name : ");
                    String name = sc.nextLine();

                    Department department = null;

                    while (department == null) {

                        System.out.print("Enter Department (ECE/CSE/IT) : ");
                        String deptName = sc.nextLine();

                        department = DepartmentFactory.getDepartment(deptName);

                        if (department == null) {
                            System.out.println("Invalid Department!");
                            System.out.println("Available Departments : ECE, CSE, IT\n");
                        }
                    }

                    students.add(new Student(id, name, department));

                    System.out.println("\nStudent Added Successfully.");

                    break;
                case 2:

                    if (students.isEmpty()) {

                        System.out.println("\nNo Students Available.");
                    }

                    else {

                        System.out.println("\n====================================");
                        System.out.println("        STUDENT DETAILS");
                        System.out.println("====================================");

                        for (Student student : students) {

                            student.displayStudent();
                        }
                    }

                    break;
                case 3:

                    System.out.println("\n====================================");
                    System.out.println("       DEPARTMENT CACHE");
                    System.out.println("====================================");

                    if (DepartmentFactory.getDepartmentCount() == 0) {

                        System.out.println("No Department Objects Created.");
                    }

                    else {

                        Map<String, Integer> countMap = new HashMap<>();

                        for (Student student : students) {

                            String dept = student.getDepartment().getDepartmentName();

                            countMap.put(dept,
                                    countMap.getOrDefault(dept, 0) + 1);
                        }

                        for (String dept : DepartmentFactory.getDepartments()) {

                            System.out.println(
                                    dept + " -> "
                                    + countMap.getOrDefault(dept, 0)
                                    + " Student(s)");
                        }
                        System.out.println("\nTotal Shared Department Objects : "
                                + DepartmentFactory.getDepartmentCount());
                    }

                    break;

                case 4:

                    System.out.println("\nExiting...");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("\nInvalid Choice!");
            }
        }

	}

}
