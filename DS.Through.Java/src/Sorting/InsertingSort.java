package Sorting;

public class InsertingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,2,9,7,8,1};
		int len=arr.length;
		for (int i=1; i < len; i++)
		{
			int j =i;
			int tmp = arr[i];
			while(j>0 && arr[j-1] > tmp)
			{
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = tmp;
		}
		for(int k =0; k< len; k++)
		{
			System.out.println(arr[k]);
		}
	}

}
