public class InsertionSort{
	public static void insertionSort(int[] arr){
		int n = arr.length;
		for(int i=1; i<n; i++){
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			display(arr);
		}
	}
	
	public static void display(int[] arr){
		for(int ele: arr){
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	
	public static void main(String... args){
		int arr[] = {55,44,33,22,11};
		
		insertionSort(arr);
		//display(arr);
		//display(arr);
	}
}