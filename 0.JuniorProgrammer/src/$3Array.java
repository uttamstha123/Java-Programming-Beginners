
public class $3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare and Assign an array
		// Datatype[] variableName = {...values};
		String[] names = { "Uttam", "Saroj", "Sugam", "Sunita", "Susma" };
		// indexing starts with 0
		// To print the values use 'variable[index]'
		System.out.println("Original : " + names[0]);
		// Change the value
		names[0] = "Ajbin";
		System.out.println("Replaced : " + names[0]);
		
		// Declare the array
		// datatype[] variable = new datatype[size];
		String[] country = new String[4];
		country[0] = "Nepal";
		country[1] = "India";
		country[2] = "Japan";
		country[3] = "USA";
		System.out.println(country[3]);
	}

}
