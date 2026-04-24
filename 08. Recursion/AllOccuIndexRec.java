public class AllOccuIndexRec {

	public static void indexPrint(int [] nums,int i,int key) {
		if(i==nums.length) return;
		if(nums[i] == key) {
			System.out.print(i + " ");
		}
		indexPrint(nums,i+1,key);
	}

	public static void main(String [] args) {
		int [] nums = {3,2,4,5,6,2,7,2,2};
		int key = 2;
		indexPrint(nums,0,key);
	}
}