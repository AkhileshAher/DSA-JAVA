public class GridWays {

	public static int gridWays(int i,int j,int n,int m) {
		// base Case
		if(i==n-1 && j==m-1) {
			return 1;
		} 
		else if(i == n || j == n){ // boundary cross condn
			return 0;
		}	
	
		
		// recursion 
		int w1 = gridWays(i+1,j,n,m);
		int w2 = gridWays(i,j+1,n,m);
		return w1 + w2;
		
	
	}

	public static void main(String [] args) {
		int n = 3;
		int m = 3;
		System.out.println("Total Ways : " + gridWays(0,0,n,m));
	}
}