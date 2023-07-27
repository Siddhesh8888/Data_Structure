package sorting;

import java.util.Arrays;

public class HeapSort {
	
	public static void heapSort(int[]arr, int len)
	{
		if(len<=0)
		{
			return;
		}
		
		for(int i=len-1; i>=0; i--)
		{
			if(arr[i]>arr[(i-1)/2])
			{
				int temp = arr[i];
				arr[i] = arr[(i-1)/2];
				arr[(i-1)/2]=temp;
			}
		}
		
		int temp = arr[0];
		arr[0] = arr[len-1];
		arr[len-1] = temp;
		
		heapSort(arr,len-1);
	}

	public static void main(String[] args) {
		int [] arr = {7,3,4,1,2};
		System.out.println(Arrays.toString(arr));
		heapSort(arr,arr.length);
		System.out.println(Arrays.toString(arr));

	}

}
