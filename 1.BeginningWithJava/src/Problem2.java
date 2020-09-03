
public class Problem2 {

	public static void main(String[] args) {
		// inuput : Shivam Singh Yadav
		// Output : S.S.Yadav
		String input = " Shvam Singh Yadav";
		String output = "";
		for (int i = 0; i < input.lastIndexOf(' '); i++) {
			char ch = input.charAt(i);
			if (ch == ' ') {
				output += input.charAt(i + 1) + ".";
			}
		}
		System.out.println(output + input.substring(input.lastIndexOf(' ') + 1, input.length()));
	}

}
