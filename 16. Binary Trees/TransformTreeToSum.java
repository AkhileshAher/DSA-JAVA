import java.lang.*;
import java.util.*;

public class Main {

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static void preorder(Node root) {
		if(root == null) {
			//System.out.print(-1 + " ");
			return;
		}
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public static int transformSum(Node root) {
		if(root == null) {
			return 0;
		}

		int leftSum = transformSum(root.left);
		int rightSum = transformSum(root.right);
		int rdata = root.data;
		root.data = leftSum + rightSum;
		return rdata + leftSum + rightSum;
	}

	public static void main(String [] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		transformSum(root);
		preorder(root);
	}

}