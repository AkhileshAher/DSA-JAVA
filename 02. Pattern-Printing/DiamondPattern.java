public class DiamondPattern {
    public static void diamond_pattern(int n) {

        // 1st Half
        for (int line = 1; line <= n; line++) {
            for (int sp = line; sp <= n - 1; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * line) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half
        for (int line = n; line >= 1; line--) {
            for (int sp = line; sp <= n - 1; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * line) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

            // for (int space = 1; space <= line - 1; space++) {
            // System.out.print(" ");
            // }

            // for (int star = 1; star <= 2 * (n - line) + 1; star++) {
            // System.out.print("*");
            // }
            // System.out.println();

        }

    }

    public static void main(String[] args) {
        diamond_pattern(4);
    }
}
