
public class HCF {

	public static void main(String[] args) {
		HCF ob = new HCF();
		System.out.println(ob.findHcf(60, 72));
	}
	int findHcf(int n1, int n2) {
		int hcf = 0;
		int min =(int) Math.min(n1, n2);
		for(int i = min ; i > 1 ; i--) {
			if(n1 % i == 0 && n2 % i == 0) {
				hcf = i;
				break;
			}
		}
		return hcf;
	}

}
