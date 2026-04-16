public class BubbleSortOptimized {
	
	public static void bubbleOptimized(int [] nums){
		int compared = 0;
		for(int i=0;i<nums.length-1;i++) {
			boolean isSwapped = false;
			for(int j=0;j<nums.length-1-i;j++) {
				if(nums[j] > nums[j+1]) {
					isSwapped = true;
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
			if(isSwapped == false) break;
		}
	}

	public static void main(String [] args) {
		int [] arr = {50,40,30,20,10};
		bubbleOptimized(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
}