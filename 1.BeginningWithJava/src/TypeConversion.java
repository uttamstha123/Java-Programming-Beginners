
public class TypeConversion {

	public static void main(String[] args) {
		// String to Int
//		String age = "102";
//		int n = Integer.parseInt(age);
//		System.out.println(Integer.parseInt("102") + 4);
		byte b;
		short s = 500;
		char c = 'a';
		int i = 1024;
		float f;
		long l;
		double d;

		// Explicit conversion --> when initializing greater size type into smaller size type
		b = (byte) s;
		b = (byte) c;
		System.out.println(b);
		
		// implicit conversion --> automatically converted into respective data types.
		d = i;
	}

}
