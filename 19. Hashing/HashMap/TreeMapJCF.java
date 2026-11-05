import java.lang.*;
import java.util.*;

public class TreeMapJCF {
	public static void main(String [] args) {

		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("India",100);
		tm.put("Nepal",6);
		tm.put("US",50);
		tm.put("Bhutan",5);

		
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("India",100);
		hm.put("Nepal",6);
		hm.put("US",50);
		hm.put("Bhutan",5);		

		System.out.println(tm);
		System.out.println(hm);
	}
}