public class HollowRhombus {

    public static void hollow_rhombus(int n) {
        for (int line = 1; line <= n; line++) {
            
            for (int space = 1; space <= n - line; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (line == 1 || line == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    static public void main(String[] args) {
        hollow_rhombus(5);
    }
}
