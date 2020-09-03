import java.util.Scanner;

public class Angle {
	int degrees;
	int minutes;
	Angle(){
		degrees = 0;
		minutes = 0;
	}
	void getAngle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the inputs: ");
		degrees = sc.nextInt();
		minutes = sc.nextInt();
	}
	Angle sum(Angle A1, Angle A2) {
		Angle A3 = new Angle();
		A3.degrees = A1.degrees + A2.degrees;
		A3.minutes = A1.minutes + A2.minutes;
		if(A3.minutes > 60) {
			int temp1 = A3.minutes / 60;
			int temp2 = A3.minutes % 60;
			A3.degrees += temp1;
			A3.minutes = temp2;
		}
		return A3;
	}
	void display(Angle A) {
		System.out.println("Degrees : " + A.degrees );
		System.out.println("Minutes : " + A.minutes );
	}
	public static void main(String[] args) {
		Angle A1 = new Angle();
		Angle A2 = new Angle();
		System.out.println("Input first angle");
		A1.getAngle();
		System.out.println("Input second angle");
		A2.getAngle();
		Angle A3 = A1.sum(A1, A2);
		A3.display(A3);
	}
}
