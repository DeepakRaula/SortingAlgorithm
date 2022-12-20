package sorting;

import java.util.Scanner;

public class SelectionSort {
	
	public static void selectionSort(int[] arr,int n) {
		if(n == 1) {
			return;
		}
		
		for(int i = 0; i < n-1; i++)
		{
			int minimum_index = i;
			
			for(int j = i+1; j <n; j++ )
			{
				if(arr[j] < arr[minimum_index])
				{
				minimum_index = j;
				}	
			}
			
			int temp = arr[minimum_index];
			arr[minimum_index] = arr[i];
			arr[i] = temp;
		}
		

		
	}
	
	

	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		int[] array = ArrayFunctions.inputArray();
		
		
		ArrayFunctions.printArray(array);
		
		selectionSort(array, array.length);
		
		ArrayFunctions.printArray(array);
		
		
		
		
		
		
	}

}
