package Inheritance;

public class Television1 extends MainProperties {
	String brand = "Sony SS101";
	int price = 35000;
	int size = 34;
	
	// There Properties are common in every Brand of Television
    // So, What can we do instead of copying and pasting the code again and again
//	public static void turnOn() {
//		System.out.println("Turned On");
//	}
//	public static void turnOff() {
//		System.out.println("Turned Off");
//	}
//	public static void volUp() {
//		System.out.println("Volume Up");
//	}
//	public static void volDown() {
//		System.out.println("Volume Down");
//	}
}
