public class BubbleSort{
	public static void bubbleSort(int[] arr){
		int n = arr.length;
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-1-i; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				display(arr);
			}
			System.out.println();
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
		
		bubbleSort(arr);
		
		//display(arr);
	}
}