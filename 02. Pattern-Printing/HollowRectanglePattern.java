public class HollowRectanglePattern {

    public static void hollowRecPattern(int totRows, int totCols) {
        for (int row = 1; row <= totRows; row++) {
            for (int col = 1; col <= totCols; col++) {
                if (row == 1 || col == 1 || row == totRows || col == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRecPattern(4,5);
    }

}
