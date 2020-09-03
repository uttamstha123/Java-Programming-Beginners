import java.util.ArrayList;
public class arraylist {

	public static void main(String[] args) {
		String[] moviesGenre = new String[3];
		moviesGenre[0] = "Action";
		moviesGenre[1] = "Comedy";
		moviesGenre[2] = "Emotional";
		// if we wan to add new element then we have to increase the size of the array also.
//		moviesGenre[3] = "Romantic";
		System.out.println(moviesGenre[2]);
		
		// Here is an Array List that makes our life much easier
		ArrayList moviesCategory = new ArrayList();
		moviesCategory.add("Action");
		moviesCategory.add("Sci-Fi");
		moviesCategory.add("Informative");
		moviesCategory.add("Documentary");
		// It is much easier to remove element from array using arrayList
		moviesCategory.remove(0); /*or*/ moviesCategory.remove("Sci-Fi");
//		moviesCategory.clear();
		System.out.println(moviesCategory.contains("Action"));
		System.out.println(moviesCategory);
		
		ArrayList<String> books = new ArrayList<String>();
		books.add("Maths");
		books.add("English");
		System.out.println(books);
	}

}
