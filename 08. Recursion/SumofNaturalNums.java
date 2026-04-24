public class SumofNaturalNums {

	public static int CalcSum(int n) {
		if(n==1) {
			return 1;
		}
		return n + CalcSum(n-1);
	
	}	

	public static void main(String [] args) {
		int n =5;
		System.out.println("Sum : " + CalcSum(n));
	}
}