public class NumberPyramid {

    public static void number_pyramid(int n) {
        int counter = 0;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            counter++;
            for (int num = 1; num <= row; num++) {
                System.out.print(counter + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        number_pyramid(5);
    }
}
