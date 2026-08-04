package factorymethod;

public class AttendanceReport implements Report {
	@Override
    public void generateReport(Student student) {

        System.out.println("\nAttendance Report Generated");
        System.out.println("--------------------------------");
        System.out.println("Student ID   : " + student.getStudentId());
        System.out.println("Name         : " + student.getName());
        System.out.println("Branch       : " + student.getBranch());
        System.out.println("Attendance   : "+student.getattendance()+"%");
        if(student.getattendance() >= 75)
            System.out.println("Status       : Eligible");
        else
            System.out.println("Status       : Not Eligible");
    }

}
