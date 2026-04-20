
import java.util.Scanner;

public class StringPalindrome {

    public static boolean checkStringPalindrome(String str) {
        // two pointers
        int fp = 0;
        int lp = str.length() - 1;
        while (fp < lp) {
            if (str.charAt(fp) == str.charAt(lp)) {
                lp--;
                fp++;
            } else {
                System.out.println("NOT A PALINDROME");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (checkStringPalindrome(str)) {
            System.out.println("PALINDROME");
        }

        sc.close();
    }
}
