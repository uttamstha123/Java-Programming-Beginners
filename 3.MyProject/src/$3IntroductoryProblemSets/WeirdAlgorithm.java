
package $3IntroductoryProblemSets;
import java.util.Scanner;

public class WeirdAlgorithm {

	public static void main(String[] args) {
		// Take input as integer
		long n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer");
		n = sc.nextLong();
		while (true) {
			System.out.print(n+" ");
			// check the break condition
			if (n == 1) {
				break;
			}
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = n * 3 + 1;
			}
		}

	}

}
