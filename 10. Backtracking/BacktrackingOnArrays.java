public class BacktrackingOnArrays {
	public static void changeArr(int [] nums,int i,int val) {
		//base case
		if(i == nums.length) {
			printArr(nums);
			return;
		}
		// recursion work
		nums[i] = val;
		changeArr(nums,i+1,val+1);  // fnx call step
		nums[i] = nums[i] - 2;	    // backtracking step
	}

	public static void printArr(int [] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		int [] arr = new int[5];
		changeArr(arr,0,1);
		printArr(arr);
	}
}