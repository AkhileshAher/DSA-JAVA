public class SearchSortednRotatedArray {

	public static int search(int [] nums,int key,int low,int high) {
		int mid = low + (high - low) / 2;

		if(nums[mid]== key) return mid;

		if(nums[low] <= nums[mid]) {
			if(nums[low] <= key && key <= nums[mid]) {
				return search(nums,key,low,mid-1);
			} else {
				return search(nums,key,mid+1,high);
			}
		}
		else {
			if(nums[mid] <= key && key <= nums[high]) {
				return search(nums,key,mid+1,high);
			}
			else  {
				return search(nums,key,low,mid-1);	
			}	
		}
	}

	public static void main(String [] args) {
		int [] arr = {4,5,6,7,0,1,2};
		int target = 6;
		int tarIdx = search(arr,target,0,arr.length-1);
		System.out.println(tarIdx);
	}	
}