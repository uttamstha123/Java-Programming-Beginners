import java.util.HashSet;
import java.util.Iterator;

public class JavaHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Football");
		set.add("Cricket");
		set.add("Badminton");
//		set.remove("Badminton");
		set.contains("Badminton");
		System.out.println(set.size());
		Object[] games = set.toArray();
//		set.clear();
		System.out.println(games[1]);
		
		HashSet<Integer> num = new HashSet<Integer>();
		num.add(10);
		num.add(15);
		num.add(20);
		Iterator<Integer> i = num.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	}

}
