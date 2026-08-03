package Decorator;

public class PlacementDetails {
	Student student;
	String company;
    String role;
    String location;
    String date;
    
    Priority priority;

    public PlacementDetails(Student student,String company, String role, String location, String date,Priority priority) {
        this.student=student;
        this.company = company;
        this.role = role;
        this.location = location;
        this.date = date;
        this.priority=priority;
    }

}
