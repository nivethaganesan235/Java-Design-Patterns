package flyweight;

public class Student {
	private int studentId;
    private String studentName;
    private Department department;

    public Student(int studentId, String studentName, Department department) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void displayStudent() {

        System.out.println("--------------------------------");
        System.out.println("Student ID         : " + studentId);
        System.out.println("Student Name       : " + studentName);

        department.displayDepartment();

        System.out.println("Department Object  : "
                + department.hashCode());
    }

}
