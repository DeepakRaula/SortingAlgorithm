package sorting;

import java.util.Scanner;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr, int n) {
		if(n == 1) {
			return;
		}
		
		for(int i = 0; i < n-1; i++) {
			if(arr[i+1] < arr[i]) {
				int temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
			}
		}
		
		bubbleSort(arr, n-1);
	}
	

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] array = ArrayFunctions.inputArray();
		
		ArrayFunctions.printArray(array);
		
		bubbleSort(array,array.length);
		
		ArrayFunctions.printArray(array);
		
		
		
		
		
	}
}
