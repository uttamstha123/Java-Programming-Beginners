import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
//		int[] a = {1,2,4};
//		System.out.println(a[3]);  // This is an exception 
		// So how do we solve the problem of this exception
		// We can use try and catch
//		try {
//			int[] a = {1,2,4};
//			System.out.println(a[3]);
//		} catch (Exception e) {
//			System.out.println("Not exists");
//		}

		// Lets try another example

		try {
			System.out.println("Make your own list ");
			Scanner sc = new Scanner(System.in);
			System.out.println("---------------");
			System.out.println("Enter the size of list: ");
			int n = sc.nextInt();
			System.out.println("---------------");
			ArrayList<String> list = new ArrayList<String>();
			System.out.println("List the Items: ");
			for (int i = 0; i <= n; i++) {
				list.add(sc.nextLine());
			}

			System.out.println("Press G to get List Element");
			String userElement = sc.next().toUpperCase();
			while (true) {
				if (userElement.equals("G")) {
					System.out.println("Get your List :: Type the Index :\n  Or type to exit");
					int index = sc.nextInt();
					System.out.println(list.get(index));
					System.out.println("---------------");
				} else {
					break;
				}
			}
		} catch (NullPointerException e) {
			System.out.println("You have an Empty List");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Not in range");
		} catch (Exception e) {
			System.out.println("Opps ! Something went wrong");
		}
	}
//	for(int i = 0 ; i < list.size() ; i++) {
//	System.out.print(list.get(i).toUpperCase()+" ");
//	
//}
}
