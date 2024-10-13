public class MergeSort{
	public static void mergeSort(int[] arr, int l, int h){
		if(h>l){
			int mid = l+(h-l)/2;
			mergeSort(arr,l,mid); //Left side
			mergeSort(arr,mid+1,h); //right side
			
			merge(arr,l,mid,h);
		}
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
		
		mergeSort(arr,0,arr.length-1);
		display(arr);
		System.out.println("Congratulations!! Samruddhi is officially your mentor now");
	}
}