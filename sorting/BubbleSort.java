package sorting;

//Stable sort Algorithm
//To compare one index with its next untill the array is fully sorted
public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {11,22,33,80,50,830,30,-20,-90};
		int lastUnSortedIndex = (arr.length-1);//To traverse upto the last unsorted index
		while(lastUnSortedIndex>0)
		{
			for(int i=0;i<lastUnSortedIndex;i++) {
				if(arr[i]>arr[i+1])//as we are sorting inascending order
					swap(arr,i,i+1);//swapping of two position
			}
			lastUnSortedIndex--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
	public static void swap(int arr[], int a, int b)//a=firstIndex,b=secondIndex which will be swap.
	{
		//if both are equal.
		if(a==b)
			return;
		//else we will swap those two.
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}

}
