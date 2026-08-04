package facade;

public class HostelDepartment {
	public boolean allocateHostel(Student student) {

		System.out.println("\n[5/6] Hostel Allocation");
        System.out.println("--------------------------------");

        if(student.isHostelRequired()) {

            System.out.println(" Hostel Room Allotted");

        }
        else {

            System.out.println(" Hostel Not Requested");

        }

        return true;

    }

}
