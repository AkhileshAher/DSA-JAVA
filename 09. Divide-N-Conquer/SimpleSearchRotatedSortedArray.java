public class SimpleSearchRotatedSortedArray {

	public static int searchInRotatedSortedArray(int [] arr,int key) {
		int low = 0;
		int high = arr.length -1;
		int mid = low + (high - low)/2;
		while(low <= high) {
			
			if(arr[mid] == key) {
				return mid;
			}
						
			if(arr[low] <= arr[mid]) {
				// left Sorted Array
				if(arr[low] <= key && key <= arr[mid]) {
					high = mid-1;	
				} else {
					low = mid + 1;
				}
			} else {
				// right Sorted Array
				if(arr[mid] <= key && key <= arr[high]) {
					low = mid +1;	
				} else {
					high = mid -1;
				}
			}
			mid = low + (high - low)/2;
		}
		return -1;
	}


	public static void main(String [] args) {
		int [] arr = {7,8,9,1,2,3,4,5,6};
		int key = 1;
		int res = searchInRotatedSortedArray(arr,key);
		System.out.println(res);
	}
}