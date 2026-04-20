
public class CheckTwoStringsAnagrams {

    public static void checkAnagrams(String str1, String str2) {
        int[] farr = new int[26];
        int [] sarr = new int[26];
        
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            farr[ch - 97]++;
        }
        for (int j = 0; j < str2.length(); j++) {
            char ch = str2.charAt(j);
            sarr[ch - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            if(farr[i] != sarr[i]) {
                System.out.println("NOT ANAGRAM");
                return;
            }
        }
        System.out.println("IS ANAGRAM");

    }

    public static void main(String[] args) {
        // System.out.println(('b' - 97));
        checkAnagrams("race", "care");
    }
}
