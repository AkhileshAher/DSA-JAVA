public class QuickSort {

	public static void printArr(int [] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
	}

	public static int partition(int [] arr,int low,int high) {
		int pivot = arr[high]; // last element as Pivot
		int i = low - 1;
		for(int j=low;j< arr.length-1;j++) {
			if(arr[j] <= pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		i++;
		// swap pivot
		int temp = pivot;
		arr[high] = arr[i];
		arr[i] = temp;
		return i;
	}

	public static void quickSort(int [] arr,int low,int high) {	
		if(low >= high) return;
		int pIdx = partition(arr,low,high);
		quickSort(arr,low,pIdx - 1); // left
		quickSort(arr,pIdx+1,high);  // right
	}

	public static void main(String [] args) {
		int [] nums = {6,3,9,8,2,5};
		quickSort(nums,0,nums.length-1);
		printArr(nums);
	}	

}