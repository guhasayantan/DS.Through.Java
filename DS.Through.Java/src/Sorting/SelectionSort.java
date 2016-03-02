package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,3,9,7,8,5,6};
		int len = arr.length;
		
		for(int i=0; i< len; i++)
		{
			int minindex = i;
			
			for(int j=i+1; j<len; j++)
			{
				if(arr[j] < arr[minindex])
				{
					minindex = j;
				}
			}
			
			int tmp = arr[i];
			arr[i]=arr[minindex];
			arr[minindex] = tmp;
			
		}
		
		for(int k=0; k <len; k++)
		{
			System.out.print(arr[k] + ",");
		}
	}

}
