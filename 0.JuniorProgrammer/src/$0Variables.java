
public class $0Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Salary Calculator

		// Create the variable to define the career
		// Declare a variable
		String career;
		// Define a variable
		career = "Software Developer";
		// declare and define the variable
		int hoursPerWeek = 40;
		int weekPerYear = 50;
		double rate = 42.5;

		// Calculate the annual salary
		// rate * hoursPerWeek * weekPerYear
		double salary = rate * hoursPerWeek * weekPerYear;

		// Redefine
		career = "Web Developer";
		// Display the output
		System.out.println(
				"My Career : " + career + "\nAt the rate of $" + rate + " per hour which is $" + salary + " per year.");
//		System.out.println("My Salary : " + salary);
	}

}