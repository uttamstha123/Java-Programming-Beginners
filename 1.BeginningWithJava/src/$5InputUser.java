// Here it is import statements
import java.util.Scanner;
public class $5InputUser {
	public static void main(String args[]) {
		// Taking input from the user as a string
		// We have to use something called Scanner class
		Scanner sc = new Scanner(System.in);
		// To use it in out program we have to import it path from the java library
		// Inside the bracket (System.in) means that it will read what ever user types inside the console
		// Lets ask user to input their name and Print their Name in Upper Case
		System.out.println("Enter your full name");
		String name = sc.nextLine(); // this line store the values typed by the user
		System.out.println(name.toUpperCase());
		
		// Input types:
		/*
		 *  1. nextLine(); // accepts the String 
		 *  2. next(); // accepts the String before any whitespace
		 *  3.nextInt();
		 *  4.nextDouble();
		 *  5.nextFloat(); ...
		 */
	}
}
