
public class MainMethod {

	public static void main(String[] args) {
		// what ever written inside this main method get executed
		// public static void main(String[] args) what does this line means
		// 'public' this keyword is known as access specifier
		// this gives the priority to access the code of the class.
		// sayHi(); // gives an error coz we have to create an object of this class for the refrence
		// That's why java is object oriented programming language
		// so how we create the object of class
		// Name of class and object name then create the method with new keyword
//		MainMethod ob = new MainMethod();
//		ob.sayHi();
		// but we can call sayhi() method without creating the object of class
		// now the Another keyword 'static' which helps any method or variable to call itself
		
		sayHi();
	}
	// lets create the method
	// when we run the program still nothing gets printed
	// coz nothing is written inside the main method
	// lets call the this method inside the main method
	public static void sayHi() {
		System.out.println("Hi");
	}

}
