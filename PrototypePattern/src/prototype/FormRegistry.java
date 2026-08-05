package prototype;
import java.util.HashMap;
import java.util.Map;
public class FormRegistry {
	private Map<String, AdmissionForm> templates;

    public FormRegistry() {

        templates = new HashMap<>();

        loadTemplates();

    }

    private void loadTemplates() {

        templates.put("ECE",
                new AdmissionForm(
                		"ECE",
                        "ABC Engineering College",
                        "B.Tech",
                        "ECE",
                        4));

        templates.put("CSE",
                new AdmissionForm(
                		"CSE",
                        "ABC Engineering College",
                        "B.Tech",
                        "CSE",
                        4));
        templates.put("IT",
                new AdmissionForm(
                		"IT",
                        "ABC Engineering College",
                        "B.Tech",
                        "IT",
                        4));

    }

    public AdmissionForm getForm(String department) {

        department = department.toUpperCase();

        AdmissionForm prototype = templates.get(department);

        if (prototype == null) {

            return null;

        }

        return prototype.clone();

    }
    public void displayTemplates() {

    	if (templates.isEmpty()) {

            System.out.println("\nNo Templates Available.");
            return;
        }

        System.out.println("\n=================================");
        System.out.println(" AVAILABLE PROTOTYPE TEMPLATES");
        System.out.println("=================================");

        for (AdmissionForm form : templates.values()) {

            form.displayTemplate();

        }

    }

}
