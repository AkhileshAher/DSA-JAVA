import java.util.Collections;
import java.util.ArrayList;

public class SortingArrayList {
		
	public static void main(String [] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(45);
		list.add(34);
		list.add(14);
		list.add(13);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());

	}
}