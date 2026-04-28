public class FindPermutationsBacktrack {
	
	public static void permutations(String str,String ans) {
		
		// base case
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}

		// recursion // O (n * n)
		for(int i=0;i<str.length();i++) {
			char curr = str.charAt(i);
			String newStr = str.substring(0,i) + str.substring(i+1);  // remove ith character
			permutations(newStr,ans+curr);
		}			
	}

	public static void main(String [] args) {
		permutations("abc","");
	}

}