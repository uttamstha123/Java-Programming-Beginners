package $3IntroductoryProblemSets;

public class staticjava {
	static int a;
	public static void value(int a) {
		staticjava.a = a;
	}
	public static void main(String[] args) {
		value(2);
		System.out.println(a);
	}
}
