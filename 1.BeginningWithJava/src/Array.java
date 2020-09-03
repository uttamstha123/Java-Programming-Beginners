
public class Array {

	public static void main(String[] args) {
		// Array are used to store the values of same data type 
		int[] a = new int[5];
		// We have created the array of size 5 which can store the int values in a;
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		// Or we can initialize the values in other way;
		int[] b = {1,2,3,4,5};
//		System.out.println(a[1]);
//		System.out.println(b[2]);
		
		// 2d Arrays
		int[][] c = new int[3][3];
			c[0][0] = 1;
			c[0][1] = 2;
			c[0][2] = 3;
			c[1][0] = 4;
			c[1][1] = 5;
			c[1][2] = 6;
			c[2][0] = 7;
			c[2][1] = 8;
			c[2][2] = 9;
			System.out.println(c[1][1]);
			
			int [][] d = {
					{1,2,3},
					{4,5,6},
					{7,8,9}
			};
			System.out.println(d[0][2]);
	}

}
