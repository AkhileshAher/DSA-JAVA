
public class SpiralMatrix {

    public static void spiralPrint(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        int startRow = 0;
        int startCol = 0;
        int endRow = n - 1;
        int endCol = m - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(mat[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(mat[i][endCol] + " ");
            }
            // bottom
            for (int k = endCol - 1; k >= startRow; k--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(mat[endRow][k] + " ");
            }

            // left
            for (int l = endRow - 1; l >= startRow + 1; l--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(mat[l][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

    }

    public static void main(String[] args) {
        int[][] spiral = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        spiralPrint(spiral);
    }

}
