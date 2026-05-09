import java.util.*;

public class QueueUsingDeque {

    public static class Queue {
        Deque<Integer> deque = new LinkedList<>();
        public boolean isEmpty() {
            return deque.isEmpty();
        }
        
        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }
        
        public int peek() {
            return deque.getFirst();
        }
        
    }


    public static void main(String [] args){
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
     }
}