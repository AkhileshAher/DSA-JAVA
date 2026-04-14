public class Triangle01 {

    public static void triangle_0_1(int n) {
        int bit = 1;

        for (int line = 1; line <= n; line++) {
            if (line % 2 == 0) {
                bit = 0;
            } else {
                bit = 1;
            }
            for (int j = 1; j <= line; j++) {
                System.out.print(bit + " ");
                if (bit == 0) {
                    bit = 1;
                } else {
                    bit = 0;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle_0_1(5);
    }

}
