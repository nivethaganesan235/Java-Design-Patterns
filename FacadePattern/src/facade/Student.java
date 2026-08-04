package facade;

public class Student {
	private int studentId;
    private String studentName;
    private String branch;
    private String email;
    private boolean documentsSubmitted;
    private boolean feePaid;
    private boolean hostelRequired;

    public Student(int studentId, String studentName, String branch, String email,boolean documentsSubmitted,boolean feePaid,
            boolean hostelRequired) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.branch = branch;
        this.email = email;
        this.documentsSubmitted=documentsSubmitted;
        this.feePaid = feePaid;
        this.hostelRequired = hostelRequired;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getBranch() {
        return branch;
    }

    public String getEmail() {
        return email;
    }
    public boolean isDocumentsSubmitted() {
        return documentsSubmitted;
    }
    public boolean isFeePaid() {
        return feePaid;
    }

    public boolean isHostelRequired() {
        return hostelRequired;
    }

}
