package facade;

public class FeeDepartment {
	public boolean payFees(Student student) {

		System.out.println("\n[3/6] Fee Payment");
        System.out.println("--------------------------------");

        if(student.isFeePaid()) {

            System.out.println(" Admission Fee Paid");
            System.out.println(" Tuition Fee Paid");

            return true;
        }

        System.out.println(" Fee Payment Pending");

        return false;

    }

}
