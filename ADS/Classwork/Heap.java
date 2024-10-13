import java.util.*;

class HeapSort{
	
	//for max heap
	public static void heapify(int arr[], int n, int root){
		int largest = root;
		int left = 2*i+1;
		int right = 2*i+2;
		
		if(left<n && arr[left]>arr[largest]){
			largest = left;
		}
		
		if(right<n && arr[right]>arr[largest]){
			largest = right;
		}
		
		if(largest != root){
			int temp = arr[root];
			arr[root] = arr[largest];
			arr[largest] = temp;
		}
		
		heapify(arr, n, largest);
	}
	
	void heapsort(int arr[]){
		int n = arr.length;
		
	}
	
}