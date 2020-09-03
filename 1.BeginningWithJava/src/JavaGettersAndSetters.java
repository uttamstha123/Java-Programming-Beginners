import java.util.Scanner;

public class JavaGettersAndSetters {
	String name;
	int age;
	public static void main(String[] args) {
		JavaGettersAndSetters ob = new JavaGettersAndSetters();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		ob.name = sc.nextLine();
		System.out.println("Enter your Age : ");
		ob.age = sc.nextInt();
		ob.display();
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void display() {
		System.out.println("Name: "+ getName() + "\n Age: "+ getAge());
	}
}
