
public class Search{
	
	public static int linearSearch(int[] arr, int key){
		int n = arr.length;
		for(int i=0; i<n; i++){
			if(arr[i]==key)
				return i;
		}
		return -1;
	}

	public static int binarySearch(int[] arr, int key, int s, int e){
		while(e>=s){
			int mid = (s+e)/2;
			if(key==arr[mid]) 
				return mid;
			else if(key>arr[mid]) 
				s= mid+1;
			else 
				e= mid-1;
		}
		return -1;
	}
	
	public static int binarySearchRecursive(int[] arr, int key, int s, int e){
		if(e>=s){
			int mid = (s+e)/2;
			//int mid = s+(e-s)/2;
			if(key==arr[mid]) 
				return mid;
			else if(key>arr[mid]) 
				return binarySearchRecursive(arr,key,mid+1,e);
			else 
				return binarySearchRecursive(arr,key,s,mid-1);
		}
		return -1;
	}
	
	public static void main(String... args){
		int[] arr = {11,22,33,44,55,66,77,88,99};
		int n = arr.length;
		int idx1 = linearSearch(arr,77);
		System.out.println(idx1);
		
		int idx2 = binarySearchRecursive(arr,44,0,n-1);
		System.out.println(idx2);
	}
}