package singleton;

public class Company {
	private static int counter = 101;

    private int companyId;
    private String companyName;
    private String role;
    private double packageLPA;
    private String status;

    public Company(String companyName,
                   String role,
                   double packageLPA,
                   String status) {

        this.companyId = counter++;
        this.companyName = companyName;
        this.role = role;
        this.packageLPA = packageLPA;
        this.status = status;
    }

    public int getCompanyId() {
        return companyId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public void displayCompany() {

        System.out.println("\n==================================");
        System.out.println("Company Details");
        System.out.println("==================================");

        System.out.println("Company ID   : " + companyId);
        System.out.println("Company Name : " + companyName);
        System.out.println("Role         : " + role);
        System.out.println("Package      : " + packageLPA + " LPA");
        System.out.println("Status       : " + status);
    }


}
