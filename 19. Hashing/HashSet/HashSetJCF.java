import java.lang.*;
import java.util.*;

public class HashSetJCF {
	public static void main(String [] args) {

		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(2);

		System.out.println(set);

		if(set.contains(2)) {
			System.out.println("Set contains 2");
		}
		
		set.remove(2);
		System.out.println(set.contains(2));
		System.out.println(set.size());
		set.clear();
		System.out.println(set.size());
		System.out.println(set.isEmpty());

		HashSet<String> cities = new HashSet<>();
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Noida");
		cities.add("Bengaluru");
		
		Iterator it = cities.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		for(String city : cities) {
			System.out.print(city + " ");
		}

	}
}