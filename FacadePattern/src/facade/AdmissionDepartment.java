package facade;

public class AdmissionDepartment {
	public boolean approveAdmission(Student student) {

        System.out.println("\n[1/6] Admission Approval");
        System.out.println("--------------------------------");
        System.out.println(" Admission Approved for "
                + student.getStudentName());
        return true;
	}

}
