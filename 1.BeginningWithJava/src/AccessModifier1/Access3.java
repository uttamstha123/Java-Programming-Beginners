package AccessModifier1;

import AccessModifier0.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		// If i try to access that name variable in this class which is located in
		// different package
		Access3 ob1 = new Access3();
		Access1 ob2 = new Access1();
//		System.out.println(ob1.name0);
		// No we cannot because default modifier can only be access within the same
		// package

		// Now we can see that when public keyword is used we have an access to use this variable 
		// in the class also.
		System.out.println(ob2.name1);
		
		// If we extends that class then we can access the protected variable
		System.out.println(ob1.name3);
	}
}
