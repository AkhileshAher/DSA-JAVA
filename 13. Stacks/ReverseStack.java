import java.util.Stack;

public class ReverseStack {

	public static void pushAtBottom(Stack<Integer> st,int data) {
		if(st.isEmpty()) {
			st.push(data);
			return;
		}
		int top = st.pop();
		pushAtBottom(st,data);
		st.push(top);
	}
	
	public static void reverseStack(Stack<Integer> s) {
		// base case
		if(s.isEmpty()){
			return;
		}
		
		int val = s.pop();
		reverseStack(s);
		pushAtBottom(s,val);
	}	

	public static void main(String [] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		reverseStack(st);
		while(!st.isEmpty()) {
			System.out.print(st.pop() + " ");
		}
	}

}