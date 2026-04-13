import java.util.Scanner;

public class PalindromeCheck {

    public static boolean validPalindrome(int num) {
        int revNum = 0;
        int temp = num;

        while (num > 0) {
            int lastNum = num % 10;
            revNum = revNum * 10 + lastNum;
            num = num / 10;
        }
        System.out.println(revNum);
        if (revNum == temp) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int inp = scn.nextInt();
        System.out.println(validPalindrome(inp));
        scn.close();
    }
}
