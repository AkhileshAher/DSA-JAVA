
public class StringBuilderInfo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        // O(26)
        // but with String it is O(26 * n^2) i.e O(n^2)
        System.out.println(sb); // abcdefghijklmnopqrstuvwxyz
        
    }

}
