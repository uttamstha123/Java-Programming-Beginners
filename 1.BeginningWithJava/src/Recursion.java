
public class Recursion {

	public static void main(String[] args) {
		countReverse(10);
	}
	// Recursion is the process when method call itself .
	public static void countReverse(int n) {
		if(n == 0) {
			System.out.println("Done.");
		}
		else {
			System.out.println(n);
			n--;
			countReverse(n);
		}
	}

}
