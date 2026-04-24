public class XpowerNRec {
	
	public static double powerxn(int x,int n) {
		if(n==0) {
			return 1;
		}
		return x * powerxn(x,n-1);		

	}

	public static void main(String [] args) {
		System.out.println(powerxn(2,5));
	}
}