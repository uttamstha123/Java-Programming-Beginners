
public class Methods {

	public static void main(String[] args) {
		// Methods are super important if you are build a bigger project 
		// see how it works
		// let say we want to make a calculator
//		int a = 5;
//		int b = 10;
		// let try one more time
//		int c = 12;
//		int d = 22;
		// again nooooo wait its soo boring right 
//		System.out.println("Multiply : "+a*b);
//		System.out.println("Multiply : "+c*d);	
		
		mult(5,10);
		mult(12,22);
	}
	// thats why we create a method to reduce the lines code
	public static void mult(int a,int b) {
		System.out.println("Multiply : "+ a * b);
	}
}
