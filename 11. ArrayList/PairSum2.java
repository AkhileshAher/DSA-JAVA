// Find if any pair in a Sorted and Rotated ArrayList has a target Sum
// 11 15 6 8 9 10
// target = 16

import java.util.*;

public class PairSum2 {

	
	public static boolean bruteForce(ArrayList<Integer> nums,int target) {
		for(int i=0;i<nums.size();i++) {
			for(int j=i+1;j<nums.size();j++) {
				int sum = nums.get(i) + nums.get(j);
				if(sum == target) return true;
			}
		}
		return false;
	}

	public static boolean optimized(ArrayList<Integer> nums,int target) {
		int rp = -1;
		int lp = -1;
		int n = nums.size();
		for(int i=0;i<nums.size()-1;i++) {
			if(nums.get(i) > nums.get(i+1)) {
				rp = i;
				lp = i+1;
			}
		}
		
		while(lp != rp) {
			int sum = nums.get(lp) + nums.get(rp);
			if(sum == target) {
				return true;
			}
			
			if(sum < target) {
				lp = (lp + 1) % n;
			} else {
				rp = (n+rp-1) % n;
			}
		}
		return false;
	}
	

	public static void main(String [] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(15);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(10);
		int target = 16;
		// boolean b = bruteForce(list,target);
		//System.out.println(b);
		boolean b1 = optimized(list,target);
		System.out.println(b1);
	}
	
}