
public class $2Calculator {

	public static void main(String[] args) {
		$2Calculator calc = new $2Calculator();
		System.out.println("Program is starting");
		int num1 = 3;
		int num2 = 6;

		// calling the methods
		sumNumbers(num1, num2); // passing the value to methods
		subsNumbers(num1, num2);
		int result = divideNumbers(num1, num2);
		System.out.println("Division of " + num1 + " and " + num2 + " : " + result); // displaying the return value
		multNumbers(num1, num2);
	}

	// no return type has void
	static void sumNumbers(int a, int b) {
		System.out.println("Sum : " + (a + b));
	}

	static void multNumbers(int a, int b) {
		System.out.println("Multiplication of " + a + " and " + b + " : " + (a * b));
	}

	static void subsNumbers(int a, int b) {
		System.out.println("Substraction of " + a + " and " + b + " : " + (a - b));
	}

	static int divideNumbers(int a, int b) {
		return a / b; // returning the value	
	}

}
