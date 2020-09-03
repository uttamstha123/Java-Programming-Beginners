
public class Nestedloop {

	public static void main(String[] args) {
		// Nested for loop generally used in 2dArray
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("I love Programming !");
		}
		String[] actors = {"Salman", "Sarukh","Amir","Akshay"};
		System.out.println("Actors :");
		for(int i = 0 ; i < actors.length ; i++) {
			System.out.println(actors[i]);
		}
		
		// Now what is nested loop 
		// lets take an example --> an 2d array of fruits
		String[][] fruits = {
				{"Apple","Orange","Mango"},
				{"Pineapple","Banana","Coconut"},
				{"Kiwi","Grapes","Guava"}
		};
		System.out.println("My Favourite Fruits : ");
		for(int i = 0 ; i < fruits.length; i++) {
			for(int j = 0 ; j< fruits.length; j++) {
				System.out.print(fruits[i][j]+"  ");
			}
			System.out.println();
		}
		
		
	}

}
