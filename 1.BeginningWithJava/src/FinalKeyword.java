
class class1{
	final int a; // with variables
	class1(){
		a = 1;
	}
	final public void name() {
		System.out.println("My name is Illos");
	}
}

class class2 extends class1{
//	public void name() {   // It won't work coz it's a final method
//		System.out.println("My name is Uttam");
//	}
}

// With classes

final public class FinalKeyword {
		public static void main(String[] args) {
			class1 c = new class1();
			System.out.println(c.a);
			c.name();
		}		
}
// Cannot extends the main class 
//class class3 extends FinalKeyword{
//	
//}
