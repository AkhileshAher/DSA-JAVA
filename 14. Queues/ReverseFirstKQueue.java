import java.util.*;

public class ReverseFirstKQueue {

    public static void reversal(Queue<Integer> q) {
        int n = q.size();
        int [] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = q.remove();
        }

        int low = 0;
        int high = (n/2)-1;
        while(low < high) {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;high--;
        }

        for(int i=0;i<n;i++){
            q.add(arr[i]);
        }
        
    }

    public static void main(String [] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        reversal(q);
        while(!q.isEmpty()) {
            System.out.println(q.peek() + " ");
            q.remove();
        }
    }

}