package sorting;

import java.util.*;

public class QuickSort {
	
	public static int partion(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		
		for(int j = low; j < high; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
			
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		
		return i;
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if(low< high) {
			int pidx = partion(arr, low, high);
			
			quickSort(arr, low, pidx-1);
			quickSort(arr, pidx+1, high);
		}
	}
	
	
	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] array = ArrayFunctions.inputArray();
		
		ArrayFunctions.printArray(array);
		
		quickSort(array, 0, array.length);
		
		ArrayFunctions.printArray(array);
		
		
		
	}

}
