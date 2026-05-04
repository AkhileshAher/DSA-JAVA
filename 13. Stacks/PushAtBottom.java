import java.util.Stack;

public class PushAtBottom {
	
	public static void pushBottom(Stack<Integer> st,int n) {
		if(st.isEmpty()) {
			st.push(n);
			return;
		}
		int val = st.pop();
		pushBottom(st,n);
		st.push(val);
	}

	public static void printStack(Stack<Integer> st) {
		while(!st.isEmpty()) {
			System.out.print(st.peek() + " ");
			st.pop();
		}
		System.out.println();
	}	

	public static void main(String [] args) {
	
		Stack<Integer> st = new Stack<>();		
		st.push(1);
		st.push(2);
		st.push(3);
		printStack(st);
		pushBottom(st,4);
		printStack(st);
	}

}