package flyweight;
import java.util.*;
public class DepartmentFactory {
	 private static Map<String, Department> departments = new HashMap<>();

	    public static Department getDepartment(String departmentName) {

	        departmentName = departmentName.toUpperCase();

	        Department department = departments.get(departmentName);

	        if (department == null) {

	            switch (departmentName) {

	                case "ECE":

	                    department = new CollegeDepartment(
	                            "ECE",
	                            "Dr. Meenakshi",
	                            "Block A");
	                    break;

	                case "CSE":

	                    department = new CollegeDepartment(
	                            "CSE",
	                            "Dr. Kumar",
	                            "Block B");
	                    break;
	                    
	                 case "IT":

	                    department = new CollegeDepartment(
	                            "IT",
	                            "Dr. Priya",
	                            "Block C");
	                    break;

	                default:

	                    return null;
	            }

	            departments.put(departmentName, department);

	            System.out.println("\nCreating Department Object : "
	                    + departmentName);

	        }

	        else {

	            System.out.println("\nReusing Department Object : "
	                    + departmentName);

	        }

	        return department;
	    }
	    public static Set<String> getDepartments() {

	        return departments.keySet();
	    }

	    public static int getDepartmentCount() {

	        return departments.size();
	    }

}
