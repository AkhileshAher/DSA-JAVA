import java.util.*;
public class StackUsingDeque {
    
    public static class Stack {
        Deque<Integer> deque = new LinkedList<>();
   
        public boolean isEmpty() {
            return deque.isEmpty();
        }
    
        public void push(int data) {
            deque.addLast(data);
        }
        
        public int pop() {
            if(isEmpty()) {
                System.out.println("Stack Empty");
                return -1;
            }
                
            return deque.removeLast();
        }
    
        public int peek() {
            return deque.getLast();
        }

    }
   

    public static void main(String [] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        while(!s.isEmpty()) {
            System.out.println(s.peek() +" ");
            s.pop();
        }
        
    }
}