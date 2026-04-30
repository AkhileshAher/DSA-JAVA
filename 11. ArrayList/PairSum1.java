import java.util.*;

public class PairSum1 {

	public static boolean pairSumBrute(ArrayList<Integer> list,int target) {
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if((list.get(i) + list.get(j))==target) return true;
			}
		}
		return false;
	}

	public static boolean pairSum2Pointer(ArrayList<Integer> nums,int target) {
		int lp = 0;
		int rp = nums.size()-1;
		while(lp < rp) {
			int sum = nums.get(lp) + nums.get(rp);
			if(sum == target) return true;
			if(sum < target) {
				lp++;
			} else {
				rp--;
			}
		}
		return false;
	}
	
	public static void main(String [] args) {
		ArrayList<Integer> list = new ArrayList<>();
		// 1,2,3,4,5,6
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		int target = 5;
		boolean found = pairSum2Pointer(list,target);
		System.out.println(found);
	}

}