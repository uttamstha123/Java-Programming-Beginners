package Inheritance;

public class MainProperties {

	public static void main(String[] args) {
		// I have created the main properties class which contains the main method
		Television ob1 = new Television();
		System.out.println(ob1.brand);
		System.out.println("$"+ob1.price);
		System.out.println(ob1.size + " inch");
		ob1.turnOn();
		System.out.println("--------------");
		Television1 ob2 = new Television1();
		System.out.println(ob2.brand);
		System.out.println("$"+ob2.price);
		System.out.println(ob2.size + " inch");
		ob2.volDown();
	}
	// This class will store the data which are common in every object
	public static void turnOn() {
		System.out.println("Turned On");
	}

	public static void turnOff() {
		System.out.println("Turned Off");
	}

	public static void volUp() {
		System.out.println("Volume Up");
	}

	public static void volDown() {
		System.out.println("Volume Down");
	}
}
