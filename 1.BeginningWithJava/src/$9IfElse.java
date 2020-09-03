import java.util.Scanner;

public class $9IfElse {
	public static void main(String args[]) {
		// This is something very interesting
		// We will make a simple project 
		// Check the vote eligibility
		// Steps :
		
		// Ask the user to input their age
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age :");
		int age = sc.nextInt();
		// Print is the are Eligible for vote or not
		if(age < 18) {
			age = 18 - age;
			System.out.println("You are not elligible for voting !!! wait for "+age + " years more");
		}
		else {
			System.out.println("Congrats your are the responsible citizen now and have"
					+ "\nGreat chance to choose the best government for country ");
		}
	}
}
