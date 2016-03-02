package Sorting;
//Bubble Sort
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array ={5,6,3,7,4,9,2,0,1};
		int length = array.length;
		for(int j=0; j< length ; j++)
		{
			for(int i=1; i<length-j;i++)
			{
				if(array[i-1] > array[i])
				{
					int temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
				}
			}
			
		}
		for(int k=0; k< length; k++)
		{
			System.out.print(array[k]+ ",");
		}

	}

}
