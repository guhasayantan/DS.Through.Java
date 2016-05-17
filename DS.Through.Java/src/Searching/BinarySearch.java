package Searching;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] input = {1,3,5, 8,9, 11};
		int target = 9;
		System.out.println("Binary Search: The item is at index " + binarySearch(input, target));

	}
	public static int binarySearch(int[] array, int target)
	{
		int start =0;
		int end = array.length -1;
		int mid;
		if (start==end || end==0)
			return -1;
		while(start <= end)
		{
			mid = start + (end -start)/2;
			if(array[mid]==target)
				return mid;
			else if(array[mid] < target)
			{
				start = mid + 1;
			}
			else if(array[mid] > target)
			{
				end = mid -1;
			}
		}
		return -1;
	}
}
