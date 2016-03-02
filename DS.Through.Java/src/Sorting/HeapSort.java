package Sorting;

public class HeapSort {
	public static int len;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] elements = {5,7,3,4,1,9,8,6,7};
		HeapSort(elements);
		for(int i=0; i < elements.length; i++)
		{
			System.out.print(elements[i] + " ");
		}

	}
	public static void HeapSort(int[] elements)
	{
		Heapify(elements);
		for(int i=len; i>0 ;i--)
		{
			swap(elements, 0, i);
			len--;
			Maxheap(elements, 0);
		}
	}
	//Function to build the heap
	public static void Heapify(int[] elements)
	{
		len = elements.length -1;
		for(int i=len/2; i>=0; i--)
		{
			Maxheap(elements,i);
		}
	}
	//Function to swap largest element in heap
	public static void Maxheap(int[] elements, int i)
	{
		int left= 2*i;
		int right = 2*i + 1;
		int max=i;
		
		if(left <= len && elements[left] > elements[i])
			max = left;
		if(right <= len && elements[right] > elements[i])
			max = right;
		
		if(max != i)
		{
			swap(elements,i, max);
			Maxheap(elements, max);
		}
	}
	public static void swap(int[] elements, int i, int j)
	{
		int temp= elements[i];
		elements[i]=elements[j];
		elements[j]= temp;
		
	}
}
