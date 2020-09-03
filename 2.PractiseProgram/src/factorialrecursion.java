
public class factorialrecursion {

	public static int factorial(int n) {
		if (n == 1) {
			System.out.println("Factorial"+"("+n+")"+ " = " +n);
			return 1;
		} else {
			System.out.println("Factorial" + "(" + n + ")" + " = " + n +" * " +"Factorial" + "(" + (n - 1) + ")");
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(factorial(6));
	}

}
