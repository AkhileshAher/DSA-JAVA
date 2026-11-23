import java.lang.*;
import java.util.*;

public class StringConversion {

	public static void stringConversion(String s1, String s2) {
		int n = s1.length();
		int m = s2.length();
		int[][] dp = new int[n+1][m+1];
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<m+1;j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				} else {
					int ans1 = dp[i-1][j];
					int ans2 = dp[i][j-1];
					dp[i][j] = Math.max(ans1,ans2);
				}
			}
		}
		int lcs = dp[n][m];
		int insertions = m-lcs;
		int deletions = n-lcs;

		System.out.println("Deletions : " + deletions);
		System.out.println("Insertions : " + insertions);
	}


	public static void main(String [] args) {
		String str1 = "heap";
		String str2 = "pea";
		stringConversion(str1,str2);
	}

}