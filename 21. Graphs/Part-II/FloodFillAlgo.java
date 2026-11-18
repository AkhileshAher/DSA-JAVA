import java.lang.*;
import java.util.*;

public class FloodFillAlgo {

	public static void helper(int[][] image,int sr,int sc,int color,boolean[][] vis,int orgCol) {
	
		if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
			return;
		}
		vis[sr][sc] = true;
		image[sr][sc] = color;

		helper(image,sr,sc-1,color,vis,orgCol); // left
		helper(image,sr,sc+1,color,vis,orgCol); // right
		helper(image,sr-1,sc,color,vis,orgCol); // up
		helper(image,sr+1,sc,color,vis,orgCol); // down
	}

	public static int[][] floodfill(int[][] image,int sr,int sc,int color) {
		boolean[][] vis = new boolean[image.length][image[0].length];
		helper(image,sr,sc,color,vis,image[sr][sc]);
		return image;
	}

	public static void print(int[][] image) {
		for(int i=0;i<image.length;i++) {
			for(int j=0;j<image[i].length;j++) {
				System.out.print(image[i][j] + " ");
			}
			System.out.println();
		}	
	}

	public static void main(String [] args) {
		int [][] image = {{1,1,1},{1,1,0},{1,0,1}};
		int sr = 1;
		int sc = 1;
		int color = 2;
		floodfill(image,sr,sc,color);
		print(image);
	}
}