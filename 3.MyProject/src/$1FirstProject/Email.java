package $1FirstProject;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int passlength;
	private String email;
	private String altEmail;
	Scanner sc = new Scanner(System.in);

	// constructor to receive firstname and lastname
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		System.out.println("Your Name: " + this.firstName + " " + this.lastName);

		// call a method and return the value
		this.department = setDepartment();
		System.out.println("Department :" + this.department);

		// displaying Password

		System.out.println("Set the Length of your password: ");
		passlength = sc.nextInt();

		this.password = randomPass(passlength);
		System.out.println("Your Password: " + this.password);
		this.email = email();
		System.out.println("Email:" + email);
	}

	// get department choice
	private String setDepartment() {
		System.out.print(
				"Department code:\n " + "1. for Developer \n 2. for Sales \n 3. for Accounting \nDepartment choice: ");
//		Scanner sc = new Scanner(System.in);		
		int departmentChoice = sc.nextInt();
		if (departmentChoice == 1) {
			return "Dev";
		} else if (departmentChoice == 2) {
			return "Sales";
		} else if (departmentChoice == 3) {
			return "Acc";
		} else {
			return "";
		}
	}

	// generate random password
	private String randomPass(int length) {
		String passwordSet = "ABCEDFGHIJKLMNOPQRSTUVWXYZ0123456789@$#*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}

	// Set email
	private String email() {
		String em = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + "company.com";
		return em;
	}
}
