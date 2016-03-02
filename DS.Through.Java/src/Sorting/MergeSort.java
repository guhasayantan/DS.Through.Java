package Sorting;

public class MergeSort {
	public static  int[] arr = {9,6,8,2,7,2,3,1};
	public static int len = arr.length;
	public static  int[] temparr = new int[len];
	
	public static void main(String[] args) {
		

		doMergeSort(arr, 0, len-1);
		for(int i=0; i< len; i++)
		{
			System.out.print(arr[i] + ",");
		}
	}
	public static void doMergeSort(int[] A,int start, int end)
	{
		if(start<end)
		{
			int mid = start+(end-start)/2;
			doMergeSort(A, start, mid); //for the left hand sort
			doMergeSort(A, mid+1, end); //for the right hand sort
			doMerge(start, mid, end); //combine them
		}
	}
	public static void doMerge(int start, int mid, int end)
	{
		//copy both parts in to the temp array
		for(int i =start; i<=end;i++)
		{
			temparr[i]= arr[i];

		}
		int i = start;
		int j = mid + 1 ; 
		int k = start;
		//copy smallest values from either left or right to original array
		while (i<=mid && j<=end)
		{
			if(temparr[i]<=temparr[j])
			{
				arr[k]=temparr[i];
				i++;
			}
			else
			{
				arr[k]=temparr[j];
				j++;
			}
			k++;
		}
		//copy rest of left side of array to target array
		while(i<=mid)
		{
			arr[k]=temparr[i];
			k++;
			i++;
		}
	}

}
