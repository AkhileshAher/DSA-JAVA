import java.util.*;

public class NthFibboSeries {

	public static int fibboNum(int n) {
		if(n==1) return 1;
		if(n==0) return 0;
		return fibboNum(n-1) + fibboNum(n-2);
	}

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		System.out.println(fibboNum(n-1));
		sc.close();
	}
}