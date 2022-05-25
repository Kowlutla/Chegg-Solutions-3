package application;

public class MaxHeap {
	

	public void buildMaxHeap(int[] array) {
	
		int n=array.length;
		//to build max heap
		for(int i=n/2-1;i>=0;i--)
		{
			maxheapify(array,n,i);
		}
		
		//delete element one by one
		
		for(int i=n-1;i>=0;i--)
		{
			int temp=array[0];
			array[0]=array[i];
			array[i]=temp;
			maxheapify(array,i,0);
		}
		
		
	}

	private void maxheapify(int[] array, int n, int i) {
	
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n && array[left]>array[largest])
		{
			largest=left;
		}
		
		if(right<n && array[right]>array[largest])
		{
			largest=right;
		}
		
		if(largest!=i)
		{
			int temp=array[i];
			array[i]=array[largest];
			array[largest]=temp;
			maxheapify(array,n,largest);
		}
		
	}


}
