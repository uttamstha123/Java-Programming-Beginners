
public class BreakStatement {

	public static void main(String[] args) {
		// Basically break statement jumps out of the loops and switch
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			} else {
				System.out.println("Hii");
			}
		}
		System.out.println("--------------");
		int i = 0;
		switch (i) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		default:
			System.out.println("null");
		}
		System.out.println("--------------");
		// But here is the interesting thing
		// Nested loop
		for (int j = 0; j <= 3; j++) {
			for (int k = 0; k <= 3 ; k++) {
				System.out.println(j + ", " + k);
				break;
			}
		}
	}

}
