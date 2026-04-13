public class PalindromicNumber {

    public static void palindromic_number(int n) {

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(" " + j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        palindromic_number(5);
    }
}