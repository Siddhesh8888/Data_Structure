package sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public static void insertionSort(int[]arr)
	{
		for(int i=1; i<arr.length; i++)
		{
			int j, temp = arr[i];
			for(j=i-1; j>=0 && arr[j]>temp; j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		int [] arr = {7,3,4,1,2};
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
