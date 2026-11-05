import java.lang.*;
import java.util.*;

public class LinkedHashMapJCF {
	
	public static void main(String [] args) {
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
		lhm.put("India",100);
		lhm.put("Nepal",100);
		lhm.put("Indonesia",100);
		lhm.put("Bhutan",100);

		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("India",100);
		hm.put("Nepal",100);
		hm.put("Indonesia",100);
		hm.put("Bhutan",100);	

		System.out.println(lhm);
		System.out.println(hm);
	}
}