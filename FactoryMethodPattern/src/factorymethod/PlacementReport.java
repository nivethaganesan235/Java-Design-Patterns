package factorymethod;

public class PlacementReport implements Report {
	@Override
    public void generateReport(Student student) {

        System.out.println("\nPlacement Report Generated");
        System.out.println("--------------------------------");
        System.out.println("Student ID   : " + student.getStudentId());
        System.out.println("Name         : " + student.getName());
        System.out.println("Branch       : " + student.getBranch());
        System.out.println("Company      : " + student.getCompany());
        System.out.println("Role         : " + student.getRole());
        if(student.getPlacementstatus()) {
            System.out.println("Status       : Selected");
        }
        else {
            System.out.println("Status       : Not Selected");
        }
    }

}
