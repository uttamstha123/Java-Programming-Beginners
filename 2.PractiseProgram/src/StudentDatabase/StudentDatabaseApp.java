package StudentDatabase;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		StudentDatabase student1 = new StudentDatabase("Uttam", "5854215");
		student1.enroll("Maths");
		student1.enroll("Computer");
		student1.enroll("Music");
		student1.payTution(500);
		System.out.println(student1.toString());
	}

}
