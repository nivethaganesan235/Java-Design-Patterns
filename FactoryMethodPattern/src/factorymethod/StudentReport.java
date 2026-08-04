package factorymethod;

public class StudentReport implements Report {
	@Override
    public void generateReport(Student student) {

        System.out.println("\nStudent Academic Report Generated");
        System.out.println("--------------------------------");
        System.out.println("Student ID   : " + student.getStudentId());
        System.out.println("Name         : " + student.getName());
        System.out.println("Branch       : " + student.getBranch());
        System.out.println("CGPA         : " + student.getcgpa());
    }
	

}
