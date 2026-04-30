import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String [] args) {
		ArrayList<Integer> list = new ArrayList<>();
		// Add Element
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		
		list.add(0,12);  // O(n) --> void rt
		System.out.println(list); // 12 ,1 ,3 ,2 ,4
		
		// Get Element
		int element = list.get(3);
		//System.out.println(element);
	
		// Delete Element
		System.out.println("List Before Removal at 3 :" + list);
		list.remove(3);
		//System.out.println("List After Removal at 3 :" + list);

		// Set Element at Index
		int setEL = list.set(2,10);
		//System.out.println("After Setting List " + setEL);

		// Contains Element
		boolean bool = list.contains(10);
		//System.out.println("Contains Element : " + bool);
		
		// Length of ArrayList
		int lenOfAL = list.size();
		System.out.println("Size of ArrayList " + lenOfAL);
		
		// Print the ArrayList
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}	

}