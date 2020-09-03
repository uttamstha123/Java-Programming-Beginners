
public class Encryption {
	public static void main(String args[]) {
		String str = "Uttam"; char newCh = '\u0000'; String newStr = "";
		int key = 1;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch+key < 90) {
				newCh = (char) (ch + key);
				newStr = Character.toString(newCh);
			}
		}
		System.out.println(newStr);
	}
}
