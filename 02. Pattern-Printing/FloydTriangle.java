public class FloydTriangle {

    public static void floyd_triangle(int n) {
        int counter = 1;
        for (int line = 1; line <= n; line++) {
            for (int j = 1; j <= line; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floyd_triangle(5);
    }

}
