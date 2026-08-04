package observer;

public interface Subject {
	void registerStudent(Observer observer);

    void removeStudent(int studentId);

    void notifyStudents();


}
