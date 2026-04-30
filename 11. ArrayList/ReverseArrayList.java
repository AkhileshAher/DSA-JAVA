import java.util.ArrayList;

public class ReverseArrayList {	

	public static void main(String [] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(22);
		list.add(28);
		list.add(9);
		for(int i=list.size()-1; i>=0;i--) {
			System.out.print(list.get(i) + " ");	
		}
	}
	
}