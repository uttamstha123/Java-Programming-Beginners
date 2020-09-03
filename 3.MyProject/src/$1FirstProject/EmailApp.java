package $1FirstProject;
import java.util.Scanner;
public class EmailApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Email em1 = new Email("Uttam","Shrestha");
		System.out.println("Enter your First Name: ");
		String firstName = sc.next();
		System.out.println("Enter your last Name: ");
		String lastName = sc.next();
		
		Email em1 = new Email(firstName,lastName);
	}

}
