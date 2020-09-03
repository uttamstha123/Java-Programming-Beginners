
public class StingMethods {

	public static void main(String[] args) {
		String name = "Steve Jobs";
		System.out.println("Name : "+name);
		System.out.println("UpperCase : "+name.toUpperCase());
		System.out.println("LowerCase : "+ name.toLowerCase());
		System.out.println("First Charater : "+ name.charAt(0));
		System.out.println("Last Character : "+name.charAt(9));
		System.out.println("Substring : "+ name.substring(6,10));
		System.out.println("Index : "+name.lastIndexOf('e'));
	}

}
