
public class JavaMathClass {

	public static void main(String[] args) {
		System.out.println(Math.class);
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.abs(-3.5));
		System.out.println(Math.abs(-3));
		System.out.println(Math.acos(1)); // value of cosine
		System.out.println(Math.asin(0.5)); // value of sine
		System.out.println(Math.addExact(3, 7));
		System.out.println(Math.atan(1));
		System.out.println(Math.atan2(2, 3));
		System.out.println(Math.cbrt(8));
		System.out.println(Math.ceil(2.3));
		System.out.println(Math.copySign(4, -2)); // takes the sign of second parameter and applied to the first
													// parameters
		System.out.println(Math.cos(1));
		System.out.println(Math.cosh(3));
		System.out.println(Math.decrementExact(11)); // decrement the value by 1
		System.out.println(Math.floor(6.7));
		System.out.println(Math.floorDiv(4, 3));
		System.out.println(Math.floorMod(4,2));
		System.out.println(Math.hypot(3, 4));
		System.out.println(Math.min(2.5, -2.5));
		System.out.println(Math.max(-2.4, -2.3));
		System.out.println(Math.multiplyExact(5, 5));
		System.out.println(Math.pow(2, 10));
		System.out.println((int) Math.floor(Math.random()*100));
		System.out.println(Math.rint(4.5));
		System.out.println(Math.round(4.5));
		System.out.println(Math.signum(-4.4)); // if negative returns -1 for positive(+1) and zero(0)
	}
}
