public class InvertedHalfPyramid {

    public static void inverted_half(int n) {
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= n - line + 1; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_half(5);
    }
}
