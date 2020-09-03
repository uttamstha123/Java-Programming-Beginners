public class loops {
	public static void main(String[] args) {
		// for, while and do-while
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello World");
		}
		System.out.println("-----------");
		int i = 0;
		while(i < 5) {
			System.out.println("Hello World");
			i++;
		}
		System.out.println("-----------");
		int j = 0;
		do {
			System.out.println("Hello World");
			j++;
		}while(j<0);
	}
}
