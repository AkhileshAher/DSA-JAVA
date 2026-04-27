public class MergeSort {

	public static void printArr(int [] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	public static void merge(int [] arr,int si,int mid,int ei) {
		// left(0,3) = 4 right(4,6)=3 -> 6-0 = 6
		int [] temp = new int[ei-si+1];
		int i=si; // iterator for left part
		int j = mid+1; // iterator for right part
		int k = 0; // iterator for temp array

		while(i<=mid && j<=ei) {
			if(arr[i] < arr[j]) {
				temp[k] = arr[i];
				i++;
			} else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}
		// left part
		while(i <= mid) {
			temp[k++] = arr[i++];
		}

		// right part
		while(j <= ei) {
			temp[k++] = arr[j++];
		}
		
		// copy temp to original arr
		for(k=0,i=si;k<temp.length;k++,i++) {
			arr[i] = temp[k];
		}

	};

	public static void mergeSort(int [] arr,int si,int ei) {
		if(si >= ei) {
			return;
		}
		int mid = si + (ei-si)/2;
		mergeSort(arr,si,mid); // left
		mergeSort(arr,mid+1,ei); // right

		merge(arr,si,mid,ei);
	}

	public static void main(String [] args) {
		int [] arr = {6,3,9,5,2,8};
		mergeSort(arr,0,arr.length-1);
		printArr(arr);
	}
}