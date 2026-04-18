
public class TransposeOfMatrix {

    public static void printMatr(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void transposeMat(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;

        int transpose[][] = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m - 1; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatr(matrix);
        System.out.println("After Transpose :");
        printMatr(transpose);

    }

    public static void main(String[] args) {
        int nums[][] = { { 10, 11, 12 }, { 13, 14, 15 } };
        transposeMat(nums);
    }
}
