import java.util.*;

public class StockSpan {

	public static void main() {
		
		ArrayList<Integer> price = new ArrayList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		Stack<Integer> st = new Stack<>();
		
		price.addLast(100);
		price.addLast(80);
		price.addLast(60);
		price.add(70);
		price.add(60);
		price.add(75);
		price.add(85);
		//System.out.println(price);

		for(int i=0;i < price.size();i++) {
			while(st.size() > 0 && price.get(st.peek()) <= price.get(i)) {
				st.pop();
			}
			
			if(st.isEmpty()) {
				ans.set(i,i+1);
			} else {
				ans.set(i, i - st.peek());
			}
			st.push(i);
		}

		for(int val : ans) {
			System.out.println(val + " ");
		}
		System.out.println();
	
	}

}