import java.lang.*;
import java.util.*;

public class Main {

	public static class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static void printPath(ArrayList<Integer> path) {
		for(int i=0;i<path.size();i++) {
			System.out.print(path.get(i) + " ");
		}
		System.out.println();
	}

	public static void leafPath(Node root,ArrayList<Integer> path) {		

		if(root == null) {
			return;
		}

		path.add(root.data);

		if(root.left == null && root.right == null) {
			printPath(path);
		}

		leafPath(root.left,path);
		leafPath(root.right,path);
		path.remove(path.size()-1);
	}

	public static void main(String [] args) {

		Node root = new Node(8);
		root.left = new Node(5);
		root.left.left = new Node(3);
		root.left.left.left = new Node(1);
		root.left.left.right = new Node(4);
		root.left.right = new Node(6);
		root.right = new Node(10);
		root.right.right = new Node(11);
		root.right.right.right = new Node(14);

		leafPath(root,new ArrayList<Integer>());
	}

}