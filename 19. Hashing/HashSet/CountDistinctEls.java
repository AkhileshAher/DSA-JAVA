import java.lang.*;
import java.util.*;

public class CountDistinctEls {

	public static int distinctElements(int [] nums) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : nums) {
			set.add(num);
		}
		
		return set.size();
	}

	public static void main(String [] args) {
		int [] nums = {4,3,2,5,6,7,3,4,2,1};
		System.out.println(distinctElements(nums));
	}
}