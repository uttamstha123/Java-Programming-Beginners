package ObjectOriented;

// abstract class are used to make a list for an object to have certain properties

// interface only have abstract method in it so no need to specify abstract
interface Dogtype {
	void name();

	void type();
}

abstract class Dog {
	public void name() {
		System.out.println("Bradler");
	}

	public abstract void bark();
}

class Dogextends implements Dogtype {
//	public void bark() {
//		System.out.println("Bradler 'Bark' !");
//	}

	public void name() {
		System.out.println("Bruno");
	}

	public void type() {
		System.out.println("German");
	}

}

public class Abstraction {
	public static void main(String[] args) {
		Dogextends d = new Dogextends();
		d.name();
		d.type();
	}
}
