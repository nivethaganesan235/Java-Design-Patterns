package observer;
import java.util.*;
public class PlacementNotification {
	private String companyName;
    private String role;
    private double packageLPA;
    private String driveDate;
    private ArrayList<String> interviewRounds;

    public PlacementNotification(String companyName,
                                 String role,
                                 double packageLPA,
                                 String driveDate,
                                 ArrayList<String> interviewRounds) {

        this.companyName = companyName;
        this.role = role;
        this.packageLPA = packageLPA;
        this.driveDate = driveDate;
        this.interviewRounds = interviewRounds;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getRole() {
        return role;
    }

    public double getPackageLPA() {
        return packageLPA;
    }
    public String getDriveDate() {
        return driveDate;
    }

    public ArrayList<String> getInterviewRounds() {
        return interviewRounds;
    }

    public void displayNotification() {

        System.out.println("Company Name : " + companyName);
        System.out.println("Role         : " + role);
        System.out.println("Package      : " + packageLPA + " LPA");
        System.out.println("Drive Date   : " + driveDate);

        System.out.println("Interview Rounds");

        for (int i = 0; i < interviewRounds.size(); i++) {

            System.out.println((i + 1) + ". "
                    + interviewRounds.get(i));
        }
    }
    

}
