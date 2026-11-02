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

	public static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	public static Node mirrorBST(Node root) {
	
		if(root == null) {
			return null;
		}	
	
		Node left = mirrorBST(root.left);
		Node right = mirrorBST(root.right);
		
		root.left = right;
		root.right = left;
		return root;
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

		inorder(root);

		mirrorBST(root);

		System.out.println();

		inorder(root);

	}

}