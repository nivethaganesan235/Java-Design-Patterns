package facade;

public class DocumentVerification {
	public boolean verifyDocuments(Student student) {

        System.out.println("\n[2/6] Document Verification");
        System.out.println("--------------------------------");
        
        if(student.isDocumentsSubmitted()) {
        System.out.println(" Aadhaar Verified");
        System.out.println(" 12th Marksheet Verified");
        System.out.println(" Transfer Certificate Verified");
        return true;
        }
        System.out.println(" Documents Missing");
        return false;

    }


}
