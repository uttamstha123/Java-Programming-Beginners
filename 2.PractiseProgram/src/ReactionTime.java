import java.util.Scanner;

public class ReactionTime {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("3");
		Thread.sleep(800);
		System.out.println("2");
		Thread.sleep(800);
		System.out.println("1");
		Thread.sleep(800);
		System.out.println("Go...");
		double startTime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		sc.next();
		double endTime = System.currentTimeMillis();
		double reactionTime = (endTime - startTime) / 1000;
		System.out.println("Reactoin Time : "+reactionTime +"sec");
	}

}
