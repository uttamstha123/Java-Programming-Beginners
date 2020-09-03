import java.util.Scanner;

public class Pattern {
	// Print pattern If (n = 3)
	//  *		1
	//	* *		2
	//	* * *	3
	//	* *		2
	//	*		1
	public static void main(String[] args) {
		// Input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : ");
		int n = sc.nextInt();
		// first make this pattern
		//  *		1
		//	* *		2
		//	* * *	3		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//	* *		2
		//	*		1
		for(int k = 0 ; k < n-1 ; k++) {
			for(int j = n-1 ; j > k ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
