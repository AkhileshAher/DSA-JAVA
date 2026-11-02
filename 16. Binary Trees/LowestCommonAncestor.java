import java.lang.*;
import java.util.*;

public class LowestCommonAncestor {

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

	static boolean getPath(Node root,int n,ArrayList<Node> path) {

		if(root == null){
			return false;
		}

		path.add(root);
		
		if(root.data == n) {
			return true;
		}

		boolean foundLeft = getPath(root.left,n,path);
		boolean foundRight = getPath(root.right,n,path);

		if(foundLeft || foundRight) { 
			return true;
		}

		path.remove(path.size()-1);
		return false;
	}

	static Node lca(Node root,int n1, int n2) {

		ArrayList<Node> lpath = new ArrayList<>();
		ArrayList<Node> rpath = new ArrayList<>();

		getPath(root,n1,lpath);
		getPath(root,n2,rpath);
		
		int i =0;
		for(;i<lpath.size() && i<rpath.size();i++) {
			if(lpath.get(i) != rpath.get(i)) {
				break;
			}
		}

		Node lca = lpath.get(i-1);
		return lca;
	}

	public static Node lca2(Node root, int n1, int n2) {

		if(root == null) {
			return null;
		}

		if(root.data == n1 || root.data == n2) {
			return root;
		}

		Node leftlca = lca2(root.left,n1,n2);
		Node rightlca = lca2(root.right,n1,n2);

		if(rightlca == null) {
			return leftlca;
		} 
		if(leftlca == null) {
			return rightlca;
		}

		return root;
	}

	public static void main(String [] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		//root.right.left = new Node(6);
		root.right.right = new Node(6);

		// KLevel(root,1,3);
		System.out.println(lca(root,4,6).data);
		System.out.println(lca2(root,4,6).data);
	}

}