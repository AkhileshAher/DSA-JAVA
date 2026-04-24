public class FirstOccurenceRec {

	public static int firstOccu(int [] arr,int target,int i) {
		if(i == arr.length) return -1;
		if(arr[i] == target) return i;
		return firstOccu(arr,target,i+1);
	}

	public static void main(String [] args) {
		int [] nums = {8,1,6,9,5,10,5,2,3};
		System.out.println(firstOccu(nums,3,0));
	} 
}