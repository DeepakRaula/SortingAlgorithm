package sorting;

import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionSort(int[] arr, int n) {
			
			if(n ==1 ) {
				return;
		
		}
			
			for(int i = 1; i < n; i++) {
				int key = arr[i];
				
				int j = i -1;
				
				
				while(j >= 0 && arr[j] > key) {
					arr[j+1] = arr[j];
					j = j-1;
				}
				arr[j+1] = key;
				
			}
	
	}
	

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] array = ArrayFunctions.inputArray();
		
		ArrayFunctions.printArray(array);
		
		insertionSort(array, array.length);
		
		ArrayFunctions.printArray(array);
		
	}

}
