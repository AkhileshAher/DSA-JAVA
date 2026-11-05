import java.lang.*;
import java.util.*;

public class UnionAndIntersectionOf2Arrays {

	public static int intersection(int [] arr1,int [] arr2) {
		int count = 0;
		HashSet<Integer> set = new HashSet<>();

		for(int el : arr1) {
			set.add(el);
		}

		for(int el : arr2) {
			if(set.contains(el)) {
				count++;
				set.remove(el);
			}
		}
		return count;
	}

	public static int union(int [] arr1,int [] arr2) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int el : arr1) {
			set.add(el);
		}
		
		for(int el : arr2) {
			set.add(el);
		}
		return set.size();
	}

	public static void main(String [] args) {
		int [] arr1 = {7,3,9};
		int [] arr2 = {6,3,9,2,9,4};
		
		System.out.println(union(arr1,arr2));
		System.out.println(intersection(arr1,arr2));
	
	}

}