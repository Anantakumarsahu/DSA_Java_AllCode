package sorting;

//Unstable Sort Algorithm
//To select the largest element of the array and swap it with last unsorted index.
public class SelectionSort {
public static void main(String[] args) {
		
		int arr[] = {110,22,33,80,50,830,30,-20,-90};
		int lastUnSortedIndex = (arr.length-1);//To traverse upto the last unsorted index(Last index of the unsorted partition)
		int i;
		while(lastUnSortedIndex>0)
		{
			int largest = 0;
			for(i=1;i<=lastUnSortedIndex;i++) {
				if(arr[i]>arr[largest])
					largest=i;//to store the largest value in largest index
			}
			swap(arr,largest,lastUnSortedIndex);//to swap the largest and last index that is not sorted
			lastUnSortedIndex--;
		}
		for(i=0;i<arr.length;i++) {
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
