import java.util.ArrayList;

public class FindMaxInAl {

	public static void main(String [] args) {
		ArrayList<Integer> al = new ArrayList<>();	
		al.add(23);
		al.add(21);
		al.add(89);
		al.add(46);
		
		int largest = Integer.MIN_VALUE;
		
		
		for(int i=0;i<al.size();i++) {
			if(al.get(i) > largest) {
				largest = al.get(i);	
			}
		}
		System.out.println("Maximum Element in ArrayList : " + largest);
	
	}	
}