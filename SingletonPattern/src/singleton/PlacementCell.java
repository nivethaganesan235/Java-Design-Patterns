package singleton;
import java.util.*;

public class PlacementCell {
	private static PlacementCell instance;

    private ArrayList<Company> companies;


    private PlacementCell() {

        companies = new ArrayList<>();

    }


    public static PlacementCell getInstance() {

        if (instance == null) {

            instance = new PlacementCell();

        }

        return instance;

    }

    public void addCompany(Company company) {
    	for (Company c : companies) {

            if (c.getCompanyName().equalsIgnoreCase(company.getCompanyName())) {

                System.out.println("\nCompany already exists.");

                return;
            }

        }

        companies.add(company);

        System.out.println("\nCompany added successfully.");
        System.out.println("Generated Company ID : " + company.getCompanyId());

    }

    public void displayCompanies() {

        if (companies.isEmpty()) {

            System.out.println("\nNo Companies Available.");

            return;

        }
        System.out.println("\n=================================");
        System.out.println("RECRUITING COMPANIES");
        System.out.println("=================================");

        for (Company company : companies) {

            company.displayCompany();

        }

    }

    public void searchCompany(int companyId) {

    	for (Company company : companies) {

            if (company.getCompanyId() == companyId) {

                company.displayCompany();

                return;

            }

        }

        System.out.println("\nCompany not found.");

    }
    public void updateStatus(int companyId, String status) {

        for (Company company : companies) {

            if (company.getCompanyId()==companyId) {

                company.setStatus(status);

                System.out.println("\nRecruitment status updated successfully.");

                return;

            }

        }

        System.out.println("\nCompany not found.");

    }
    public void displayInstanceHash() {

        System.out.println("\nPlacement Cell Instance Hash Code : "
                + this.hashCode());

    }

}
