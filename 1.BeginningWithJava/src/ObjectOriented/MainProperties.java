package ObjectOriented;

import java.util.Scanner;

public class MainProperties {

	public static void main(String[] args) {
		Phones p = new Phones();
		System.out.println(p.name);
		System.out.println("$"+p.price);
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to Turn On");
		int turn = sc.nextInt();
		if(turn == 1) {
			p.powerOn();
		}
		else {
			p.powerOff();
		}
	}

}
