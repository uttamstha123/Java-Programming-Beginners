
public class ReturnStataments {
	public static void main(String[] args) {
//		sayHi();
		// What if i want to store the value for later
//		String message = sayHi();
		// Oops it return an error because this method do not return anything (void)
//		alert("hello");
		String msg = alert("Hello");
		System.out.println(msg);
		System.out.println(add(3,5));
		
		// array returning value
		int[] arr = array(1,2,3);
		System.out.println(arr[0]);
	}
	// Let create a method 
	public static void sayHi() {
		System.out.println("Hello");
	}
	public static String alert(String s) {
		return s;
	}
	// Integer return type
	public static int add(int a, int b) {
		return a + b;
	}
	// Array Return type
	public static int[] array(int a,int b,int c) {
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		return arr;
	}
}
