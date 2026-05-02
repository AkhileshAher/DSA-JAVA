public class LL {

	public static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}

	public static Node head;
	public static Node tail;

	public Node addFirst(int data) {
			// step 1 : create new Node
			Node newNode = new Node(data);
			
			if(head == null){
				head = tail = newNode;
			}

			// step 2 :Link Node
			newNode.next = head;
			
			// step3 
			head = newNode;
			
			return head;
	}

	public static void main(String [] args) {
		LL ll = new LL();
		Node a = ll.addFirst(10);
		Node b =ll.addFirst(10);
		System.out.println("Reference of A : " + a);
		System.out.println("Reference of B : " + b);
	}
}