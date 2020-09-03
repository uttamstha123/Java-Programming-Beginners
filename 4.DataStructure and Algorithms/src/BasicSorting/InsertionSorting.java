package BasicSorting;

public class InsertionSorting {

	public static void main(String[] args) {
		insertionSort();
	}

	public static void insertionSort() {
		int[] a = {4,2,9,7,1};
		int l = a.length;
		for (int i = 1; i < l; i++) {
			int temp = a[i];
			int j =  i - 1;
			while(j>=0 && temp < a[j]) {
				a[j+1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}
		for(int i = 0 ; i < l ; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}
