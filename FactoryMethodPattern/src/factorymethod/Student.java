package factorymethod;

public class Student {
	 private int studentId;
	    private String name;
	    private String branch;
	    private double cgpa;
	    private double attendance;
	    private boolean Placementstatus;
	    private String company;
	    private String role;

	    public Student(int studentId, String name, String branch,double cgpa,double attendance,boolean Placementstatus,
	                   String company, String role) {

	        this.studentId = studentId;
	        this.name = name;
	        this.branch = branch;
	        this.cgpa=cgpa;
	        this.attendance=attendance;
	        this.Placementstatus=Placementstatus;
	        this.company = company;
	        this.role = role;
	    }


	    public int getStudentId() {
	        return studentId;
	    }


	    public String getName() {
	        return name;
	    }


	    public String getBranch() {
	        return branch;
	    }
	    public double getcgpa()
	    {
	    	return cgpa;
	    }
	    public double getattendance()
	    {
	    	return attendance;
	    }
	    public boolean getPlacementstatus()
	    {
	    	return Placementstatus;
	    }
	    public String getCompany() {
	        return company;
	    }


	    public String getRole() {
	        return role;
	    }

}
