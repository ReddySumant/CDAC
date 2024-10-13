public class SelectionSort{
	public static void selectionSort(int[] arr){
		int n = arr.length;
		for(int i=0; i<n-1; i++){
			int minIdx = i;
			for(int j=i+1; j<n; j++){
				if(arr[minIdx]>arr[j])
					minIdx = j;
			}
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
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
		
		selectionSort(arr);
		
		//display(arr);
	}
}