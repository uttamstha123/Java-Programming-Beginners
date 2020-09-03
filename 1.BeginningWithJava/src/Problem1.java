
public class Problem1 {

	public static void main(String[] args) {
		String input = "shivam";
		String vowel = "AEIOUaeiou";
		String consonants = "";
		String vowels = "";
		for(int i = 0 ; i< input.length() ; i++) {
			char ch = input.charAt(i);
			if(vowel.indexOf(ch) == -1) {
				consonants += ch;
			}
			else
				vowels += ch;
		}
		System.out.println("Input: "+input.toUpperCase());
		System.out.println("Output: "+(consonants+vowels).toUpperCase());
	}
}
