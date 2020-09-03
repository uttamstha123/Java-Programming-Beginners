import java.util.HashMap;

public class javahashmaps {

	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		int c = 10;
//		HashMap<String , Integer> values = new HashMap<String , Integer>();
//		values.put("a",2);
//		values.put("b",5);
//		values.put("c",10);
//
//		System.out.println(values.remove("a"));
//		System.out.println(values);
		
		// UserName and Password
		HashMap<String , String> userDetail = new HashMap<String , String>();
		userDetail.put("Uttamstha","uttam2002");
		userDetail.put("Sunitashree","sunita12");
		userDetail.put("Sarojstha123","sthasaroj");
		System.out.println(userDetail.get("Uttamstha"));
		System.out.println(userDetail.replace("Uttamstha", "uttam2020"));
		System.out.println(userDetail.size());
		System.out.println("");
		System.out.println("------------");
		System.out.println(userDetail);
	}

}
