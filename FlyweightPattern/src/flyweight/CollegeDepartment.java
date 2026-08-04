package flyweight;

public class CollegeDepartment implements Department {
	private String departmentName;
    private String hodName;
    private String building;

    public CollegeDepartment(String departmentName,
                             String hodName,
                             String building) {

        this.departmentName = departmentName;
        this.hodName = hodName;
        this.building = building;
    }

    @Override
    public void displayDepartment() {

        System.out.println("Department : " + departmentName);
        System.out.println("HOD        : " + hodName);
        System.out.println("Building   : " + building);
    }

    @Override
    public String getDepartmentName() {
        return departmentName;
    }

}
