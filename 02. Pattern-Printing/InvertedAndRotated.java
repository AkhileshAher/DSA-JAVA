
public class InvertedAndRotated {
    public static void invert_rotate_pyramid(int rows) {
        for (int line = 1; line <= rows; line++) {
            for (int space = 1; space <= rows - line; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invert_rotate_pyramid(5);
    }
}
