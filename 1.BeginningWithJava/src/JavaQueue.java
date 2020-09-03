import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.add("Iphone");
		q.add("Samsung");
		q.add("Redmi");
		q.add("Vivo");
		System.out.println(q.poll());
		System.out.println(q.contains("honor"));
		System.out.println(q.peek());
		System.out.println(q.size());
		System.out.println(q.toArray()[1]);
		System.out.println(q);
		
		
	}

}