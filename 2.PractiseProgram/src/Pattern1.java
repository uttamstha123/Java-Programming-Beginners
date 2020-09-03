import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		// Input from User
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows of Stars !");
		int n = sc.nextInt();
//			*
//		  * * *
//		* * * * *
//    * * * * * * *
//  	* * * * *
//  	  * * *
//  	    *
		// First Pattern
//			*
//		  * * *
//		* * * * *
//    * * * * * * *
		int i, j; int c = n-1; int d = 1;
		for (i = 0; i < n; i++) {
			for(j = c ; j > 0 ; j--) {
				System.out.print(" ");
			}
			for(int k = 0  ; k < (2*i)+1; k++) {
				System.out.print("*");
			}
			System.out.println();
			c--;
		}
//  		* * * * *
//		  	  * * *
//		 	    *
		for (i = n-1; i > 0; i--) {
			for(j = 0 ; j < d ; j++) {
				System.out.print(" ");
			}
			for(int k = 0  ; k < (2*(i-1))+1; k++) {
				System.out.print("*");
			}
			System.out.println();
			d++;
		}
	}

}
