package facade;

public class CollegeAdmissionFacade {
	private AdmissionDepartment admissionDepartment;
    private DocumentVerification documentVerification;
    private FeeDepartment feeDepartment;
    private LibraryDepartment libraryDepartment;
    private HostelDepartment hostelDepartment;
    private IDCardDepartment idCardDepartment;

    public CollegeAdmissionFacade() {

        admissionDepartment = new AdmissionDepartment();
        documentVerification = new DocumentVerification();
        feeDepartment = new FeeDepartment();
        libraryDepartment = new LibraryDepartment();
        hostelDepartment = new HostelDepartment();
        idCardDepartment = new IDCardDepartment();

    }
    public void admitStudent(Student student) {

        System.out.println("\n====================================");
        System.out.println("      COLLEGE ADMISSION PORTAL");
        System.out.println("====================================");

        System.out.println("\nStudent Details");
        System.out.println("------------------------------------");
        System.out.println("ID      : " + student.getStudentId());
        System.out.println("Name    : " + student.getStudentName());
        System.out.println("Branch  : " + student.getBranch());
        System.out.println("Email   : " + student.getEmail());

        System.out.println("\nProcessing Admission...");
        System.out.println("------------------------------------");

        if (!admissionDepartment.approveAdmission(student)) {
            failed(student, "Admission Rejected");
            return;
        }

        if (!documentVerification.verifyDocuments(student)) {
            failed(student, "Required Documents Missing");
            return;
        }

        if (!feeDepartment.payFees(student)) {
            failed(student, "Admission Fee Not Paid");
            return;
        }

        if (!libraryDepartment.registerLibrary(student)) {
            failed(student, "Library Registration Failed");
            return;
        }

        if (!hostelDepartment.allocateHostel(student)) {
            failed(student, "Hostel Allocation Failed");
            return;
        }

        if (!idCardDepartment.generateID(student)) {
            failed(student, "ID Card Generation Failed");
            return;
        }
            
            System.out.println("\n====================================");
            System.out.println(" Admission Completed Successfully");
            System.out.println("====================================");
            System.out.println("Student : " + student.getStudentName());
            System.out.println("Branch  : " + student.getBranch());
            System.out.println("Hostel  : "
                    + (student.isHostelRequired() ? "Yes" : "No"));
            System.out.println("Status  : APPROVED");
            System.out.println("====================================");
        

    }
    private void failed(Student student, String reason) {

        System.out.println("\n====================================");
        System.out.println("       ADMISSION FAILED");
        System.out.println("====================================");
        System.out.println("Student : " + student.getStudentName());
        System.out.println("Reason  : " + reason);
        System.out.println("Status  : REJECTED");
        System.out.println("====================================");
    }

}
