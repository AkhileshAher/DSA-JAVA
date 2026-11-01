import java.lang.*;
import java.util.*;

public class MaxLengthChainPairs {

	public static void main(String [] args) {
		int [][] pairs = {{5,24},{39,60},{5,28},{27,40},{50,90}};

		Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

		int chainLen = 1;
		int chainEnd = pairs[0][1];

		for(int i=1;i<pairs.length;i++) {
			if(chainEnd <= pairs[i][0]) {
				chainEnd = pairs[i][1];
				chainLen++;
			}
		}		
		System.out.println(chainLen);
	}
}