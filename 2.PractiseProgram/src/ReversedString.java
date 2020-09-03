
public class ReversedString {

	public static void main(String[] args) {
		reverse("Uttam");
	}
	public static void reverse(String s) {
		char[] letters = new char[s.length()];
		int letterIndex = 0;  String r = "";
		for(int i = s.length()-1; i >= 0; i--) {
			letters[letterIndex] = s.charAt(i);
			letterIndex++;
		}
		
		for(int i = 0 ; i<letterIndex ; i++) {
			r = r +  letters[i];
//			System.out.println(letters[i]);
		}
		System.out.println(r.toUpperCase());
	}

}
