package ObjectOriented;

import java.util.Scanner;

public class MainEncapsulation {
	public static void main(String[] args) {
		Encapsulation ob = new Encapsulation();
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :");
		String name = scan.nextLine().toUpperCase();
		System.out.println("Enter age :");
		int age = sc.nextInt();
		ob.setName(name);
		ob.setAge(age);
		System.out.println("Name : " + ob.getName() + "\nAge : " + ob.getAge());
	}
}
