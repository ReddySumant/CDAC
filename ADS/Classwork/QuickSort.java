public class QuickSort{
	public static void quickSort(int[] arr, int low, int high){
		if(high>low){
			int pivot = partition(arr,low,high);
			quickSort(arr,low,pivot-1); //Left side
			quickSort(arr,pivot+1,high); //right side
		}
	}
	
	public static int partition(int a[], int low, int high){
		int pivot = a[high];
		int i = low-1;
		
		for(int j=low; j<high; j++){
			if(a[j]<pivot){
				i++;
				swap(a,i,j);
			}
		}
		swap(a,i+1,high);
		return i+1;
		
	}
	
	public static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void merge(int[] arr, int l, int m, int h){
		int n1 = m-l+1;
		int n2 = h-m;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(int i=0; i<n1; i++){
			left[i] = arr[l+i];
		}
		
		for(int i=0; i<n2; i++){
			right[i] = arr[m+1+i];
		}
		
		int i=0;
		int j=0;
		int k=l;
		
		while(i<n1 && j<n2){
			if(left[i]<=right[j]){
				arr[k] = left[i];
				i++;
			}else{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<n1){
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<n2){
			arr[k] = right[j];
			j++;
			k++;
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
		
		quickSort(arr,0,arr.length-1);
		display(arr);
		System.out.println("Congratulations!! Samruddhi is officially your mentor now");
	}
}