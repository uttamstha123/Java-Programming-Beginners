package ObjectOriented;

import java.util.Scanner;

public class JavaConstructors {
	String name;
	int age;
	String grade;
	long phoneNum;
	double perc;
	private String phno;

	// Lets create the constructor
//	JavaConstructors() {
//	} // this is default constructor

	JavaConstructors(String name, int age, String grade, long phoneNum) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.phoneNum = phoneNum;
	}

	public static void resultPass() {
		System.out.println("Pass !");
	}

	public static void resultFail() {
		System.out.println("Failed !");
	}

	// Main class
	public static void main(String[] args) {
		String name, user,grade;
		int age;
		long phno;
		double perc;
		Scanner sc = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Type 'YES' to check your result and 'Q' to exit ");
			user = sc.next().toUpperCase();
			if (user.equals("YES")) {
				System.out.println("Enter the Name of the Student: ");
				name = scan.nextLine();
				System.out.println("Enter the age of the Student: ");
				age = sc.nextInt();
				System.out.println("Enter the grade : ");
				grade = scan.nextLine();
				System.out.println("Enter the Phone Number: ");
				phno = sc.nextLong();
				System.out.println("Enter the Percentage");
				perc = sc.nextDouble();
				JavaConstructors result = new JavaConstructors(name, age,grade, phno);
				System.out.println("Name \t Age \t Grade \t PhoneNumber");
				System.out.println(result.name + "  \t" + result.age + "  \t" + result.grade+"  \t" + result.phoneNum);
				System.out.println("----------------------");
				if (perc > 60) {
					resultPass();
				} else {
					resultFail();
				}
			} else if (user.equals("Q")) {
				break;
			} else {
				System.out.println("Try Again");
			}
		}
		// This seems to be soo hardwork
//		result.name = "Uttam";
//		result.age = 17;
//		result.grade = "11th";
//		result.phoneNum = 9125106355l;

	}
}
