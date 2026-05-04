import java.util.Stack;

public class NextGreater {
	
	public static void bruteForce(int [] arr) {
		boolean flag;
		for(int i=0;i < arr.length;i++) {
			flag = false;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] <= arr[j]) {
					arr[i] = arr[j];
					flag = true;
					break;
				}
			}
			if(flag == false) {
				arr[i] = -1;			
			}
		}
	}


	public static void optimised(int [] arr,int [] ans) {
		Stack<Integer> st = new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			while(!st.isEmpty() && arr[i] >= arr[st.peek()]) {
				st.pop();
			}

			if(st.isEmpty()) {
				ans[i] = -1;	
			} else {
				ans[i] = arr[st.peek()];
			}
			st.push(i);
		}
	}

	public static void main(String [] args) {
		int [] arr = {6,8,0,1,3};

		//bruteForce(arr);

		int [] ans = new int[arr.length];
		optimised(arr,ans);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i] + " ");
		}
	}
}