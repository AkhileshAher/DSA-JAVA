import java.lang.*;
import java.util.*;

public class HeightCountSumOfBinaryTree {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}


	public static int height(Node root) {
		if(root == null) return 0;
		int lh = height(root.left);
		int rh = height(root.right);
		return Math.max(lh,rh)+1;
	}

	public static int countNodes(Node root) {
		if(root == null) {
			return 0;
		}
			
		int ln = countNodes(root.left);
		int rn = countNodes(root.right);
		return ln+rn+1;
	}

	public static int sumOfNodes(Node root) {
		if(root == null) {
			return 0;
		}

		int lsum = sumOfNodes(root.left);
		int rsum = sumOfNodes(root.right);
		int treeSum = lsum + rsum + root.data;
		return treeSum;
	}

	public static void main(String [] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right = new Node(3);
		root.right.right = new Node(6);
		
		System.out.println("Height of Tree : " + height(root));
		System.out.println("Total Nodes of Tree : " + countNodes(root));
		System.out.println("Sum of Nodes of Tree : " + sumOfNodes(root));
	}

}