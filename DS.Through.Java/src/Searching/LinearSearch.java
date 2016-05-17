package Searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] input = {1,3,5, 8,9, 11};
		int target = 10;
		System.out.println("Linear Search: The item is at index " + linearSearch(input, target));

	}
	public static int linearSearch(int arr[], int value)
	{
		int i = 0;
		for(; i < arr.length; i++)
		{
			if(arr[i]==value)
				 return i;
		}
		return -1;
		
	}

}
