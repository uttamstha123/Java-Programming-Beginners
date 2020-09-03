package AccessModifier0;

public class Access2 {

	public static void main(String[] args) {
		// see how we access the name variable of that class 
		// we create and object of that class
		Access1 ob = new Access1();
		// print the value of that variable
		System.out.println(ob.name0);
		System.out.println(ob.name1);
		// Let's try to access private variable 
		//System.out.println(ob.name2);
		// private don't allow to access from any other class
	}

}
