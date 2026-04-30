import java.util.*;

public class MontonicCheckAl {

	public static boolean isMonotone(ArrayList<Integer> nums) {
		int n = nums.size()-1;
		if(nums.get(0) < nums.get(n)) {
			for(int i=0;i<n;i++) {
				if(nums.get(i) > nums.get(i+1)) {
					return false;
				}
			}
		} else {
			for(int i=0;i<n;i++) {
				if(nums.get(i) < nums.get(i+1) ) {
					return false;
				}
			}
		}
		return true;
	}	


	public static void main(String [] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		boolean b = isMonotone(list);	
		System.out.println(b);
	}
	
}