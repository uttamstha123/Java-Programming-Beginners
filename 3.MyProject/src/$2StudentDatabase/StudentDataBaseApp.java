package $2StudentDatabase;

import java.util.Scanner;

public class StudentDataBaseApp {

	public static void main(String[] args) {
		// Accepting number of Entries
		System.out.println("Enter number of Students Entry");
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();
		Student[] s = new Student[nos];
		for (int i = 0; i < nos; i++) {
			s[i] = new Student();
			s[i].enrollCourse();
			s[i].payBalance();
			System.out.println(s[i].showInfo());
		}
	}

}
