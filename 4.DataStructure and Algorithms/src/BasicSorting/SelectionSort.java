package BasicSorting;

import java.util.Random;

public class SelectionSort {
	public static void main(String[] args) {
		// Array Declaration
		int pow = (int) (Math.random() * Math.pow(4, 2));
		int randSize = (int) (Math.random() * pow) + 5;
		int[] arr = new int[randSize];
		for (int i = 0; i < randSize; i++) {
			arr[i] = (int) ((int) (Math.random() * 10) + Math.random() + 1);
		}
		System.out.println("Original Array");
		for (int i = 0; i < randSize; i++) {
			System.out.print(arr[i] + " ");
		}

		// Selecting the Minimun Element in an Array
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// Swaping Element
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}

		// Displaying the Sorted Array
		System.out.println("\nSorted Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
