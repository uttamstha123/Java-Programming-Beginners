package $1Oops;

// BluePrint
class Friends{
	
	// Global variable of same properties for all objects
	String name;
	int age;
	long phno;
	
	void code(String str) {
		System.out.println(this.name + " loves "+ str);
	}
	void bestFriend(String name) {
		System.out.println(this.name + "'s best friend is "+ name);
	}
}
public class $1Introduction {
	public static void main(String[] args) {
		
		// Instantiating an object
		Friends ob = new Friends();
		
		// Define some properties
		ob.name = "Uttam";
		ob.age = 18;
		ob.phno = 912516350;
		System.out.println("My name is : "+ ob.name);
		System.out.println("My age is : " + ob.age);
		System.out.println("My phone number is : "+ ob.phno);
		
		// Abstraction
		ob.code("web development");
		ob.bestFriend("Sugam");
		
		/*
		// Variables, Attributes, Adjectives
		String name1 = "Uttam";
		int age = 18;
		long phno = 91425106355L;
		
		// Action, activity, behaviour
		System.out.println(name1 + " is " + age + " years old .");
		System.out.println("His phone Number is : " + phno);
		code("coding");
		
		// What if he wanted to do this for another person
		String name2 = "Sugam";
		int age2 = 18;
		
		// Action, activity, behaviour
		System.out.println("His bestfriend is " + name2);
		System.out.println("He is also "+ age2 + " years old");
	}
	// Enhancing by adding function to minimize code
	static void code(String str) {
		System.out.println("He loves "+ str);
		*/
	}
}
