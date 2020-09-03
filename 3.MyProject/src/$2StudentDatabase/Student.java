package $2StudentDatabase;

import java.util.Scanner;

public class Student {
	// constructor accepting students name and year
	private String fName;
	private String lName;
	private String enrollYear;
	private String courses = "";
	private int tuitionfee = 0;
	private int costOfCourse = 600;
	private static int id = 0;
	private String stdid;

	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student First Name: ");
		this.fName = sc.nextLine().toUpperCase();

		System.out.println("Enter Student Last Name: ");
		this.lName = sc.nextLine().toUpperCase();

		System.out.println("Enter Enroll Year: ");
		this.enrollYear = sc.nextLine();

		// calling method generating Id's
		setId();
		// calling method containing Enrolled courses
		
	}

	// Generate unique Id
	public void setId() {
		id++;
		this.stdid = this.enrollYear + "" + id;
	}

	// Enroll in course
	public void enrollCourse() {
		String course;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the Courses (Press Q to Quit)");
			course = sc.nextLine();
			if (!course.equalsIgnoreCase("q")) {
				this.courses = this.courses + "\n" + course;
				this.tuitionfee = this.tuitionfee + costOfCourse;
			} else {
				break;
			}
		} while (true);
		System.out.println("Total Fee: " + this.tuitionfee);
	}

	// View Balance
	public void viewBalance() {
		System.out.println("Your Balance is $" + this.tuitionfee);
	}

	// Pay Tuition
	public void payBalance() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount To Pay:");
		int payment = sc.nextInt();
		System.out.println();
		this.tuitionfee = this.tuitionfee - payment;
		System.out.println("Thank you for you payment $" + payment);
		viewBalance();
	}

	// Show status
	public String showInfo() {
		return "Name : " + fName + " " + lName + "\n" + "Student ID : " + stdid + "\n" + "Enrolled Courses : " + courses
				+ "\n";
	}
}
