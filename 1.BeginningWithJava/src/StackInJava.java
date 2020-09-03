import java.util.*;
public class StackInJava {

	public static void main(String[] args) {
		Stack<String> games = new Stack<String>();
		games.add("Pubg Mobile");
		games.add("Call Of Duty");
		games.add("Free Fire");
		System.out.println(games.pop()); // Grabbing the elements from the Stack
										// but it will be removed from the original Stack
		System.out.println(games.peek()); // This will not destroy the original Stack
		System.out.println(games);
		System.out.println("--------------");
		System.out.println(games.contains("Pubg Mobile"));
		System.out.println(games.size());
		System.out.println(games.isEmpty());
//		games.clear();
//		System.out.println(games);
		games.set(1,"Clash Of Clans" );
		System.out.println(games);
	}

}
