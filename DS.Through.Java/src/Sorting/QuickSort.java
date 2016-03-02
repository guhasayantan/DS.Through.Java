package Sorting;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] element = {4,3,2,6,8,7,5,9};
		int len= element.length-1;
		int[] result = Quicksort(element, 0, len);
		for(int i=0; i< len+1; i++)
		{
			System.out.print(result[i] + " ");
		}	

	}
	public static int[] Quicksort(int[] element, int start, int end)
	{
		if(start<end)
		{
			int index = QuickSortPartition(element, start, end);
			Quicksort(element, start, index-1);
			Quicksort(element, index+1, end);
		}
		return element;
	}
	public static int QuickSortPartition(int[] element, int start, int end)
	{
		int index = start;
		int pivot=element[end];
		for(int i=start; i< end; i++)
		{
			if(element[i] <= pivot)
			{
				//swap(element[i], element[index]);
				int temp = element[index];
				element[index] = element[i];
				element[i]=temp;
				++index;
			}
		}
		
		int temp = element[end];
		element[end] = element[index];
		element[index]=temp;
		return index;
	}
	
}
