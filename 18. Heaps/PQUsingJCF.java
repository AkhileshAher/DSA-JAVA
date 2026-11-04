import java.lang.*;
import java.util.*;

public class PQUsingJCF {

	public static void main(String [] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(5);
		pq.add(1);
		pq.add(4);

		while(!pq.isEmpty()) {
			System.out.print(pq.peek() + " ");
			pq.remove();
		}		

	}

}