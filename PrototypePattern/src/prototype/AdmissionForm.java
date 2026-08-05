package prototype;

public class AdmissionForm implements Prototype {
	private static int counter = 1001;

    private int formId;
    private String templateId;

    // Common Details (Copied)
    private String collegeName;
    private String course;
    private String department;
    private int duration;

    // Student Details (Modified after cloning)
    private int rollNumber;
    private String studentName;

    public AdmissionForm(String templateId,String collegeName,
                         String course,
                         String department,
                         int duration) {

        this.formId = counter++;
        this.templateId=templateId;

        this.collegeName = collegeName;
        this.course = course;
        this.department = department;
        this.duration = duration;
    }
    @Override
    public AdmissionForm clone() {

        
                return new AdmissionForm(
                		templateId,
                        collegeName,
                        course,
                        department,
                        duration);


    }

    public int getFormId() {
        return formId;
    }

    public String getDepartment() {
        return department;
    }
    public String getTemplateId()
    {
    	return templateId;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void displayForm() {

        System.out.println("\n=================================");
        System.out.println("Admission Form");
        System.out.println("=================================");
        
        System.out.println("Template ID  : " + templateId);
        System.out.println("Form ID      : " + formId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);

        System.out.println("\nCollege      : " + collegeName);
        System.out.println("Course       : " + course);
        System.out.println("Department   : " + department);
        System.out.println("Duration     : " + duration + " Years");
    }
    public void displayTemplate() {

        System.out.println("\n=================================");
        System.out.println("Prototype Template");
        System.out.println("=================================");

        System.out.println("Template ID : " + templateId);
        System.out.println("College     : " + collegeName);
        System.out.println("Course      : " + course);
        System.out.println("Department  : " + department);
        System.out.println("Duration    : " + duration + " Years");
    }


}
