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

	static Node createBST(int [] arr,int start,int end) {

		if(start > end) {
			return null;
		}		

		int mid = (start + end)/2;
		Node root = new Node(arr[mid]);
		root.left = createBST(arr,start,mid-1);
		root.right = createBST(arr,mid+1,end);
		return root;
	}

	static void preorder(Node root) {
		if(root == null) {
			return;
		}	
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	static void inorder(Node root, ArrayList<Integer> path)  {
		if(root == null) return;
		inorder(root.left,path);
		path.add(root.data);
		inorder(root.right,path);
	}

	public static void main(String [] args) {
		
		Node root = new Node(8);
		root.left = new Node(6);
		root.left.left = new Node(5);
		root.left.left.left = new Node(3);

		root.right = new Node(10);
		root.right.right = new Node(11);
		root.right.right.right = new Node(12);

		preorder(root);
	
		ArrayList<Integer> tree = new ArrayList<>();
		inorder(root,tree);
		int [] arr = new int[tree.size()];

		for(int i=0;i<tree.size();i++) {
			arr[i] = tree.get(i);
		}	
		Node r1 = createBST(arr,0,arr.length-1);
		System.out.println();
		preorder(r1);
		
	}
}