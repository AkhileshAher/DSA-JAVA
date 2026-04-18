public class DiagonalSum {

    public static void diagonalSum(int mat[][]) {
        int n = mat.length;
        // int m = mat[0].length;
        int sum = 0;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // if (i == j) {
        // sum += mat[i][j];
        // }
        // else if(i+j == n-1) {
        // sum += mat[i][j];
        // }
        // }
        // }
        
        for (int i = 0; i < mat.length; i++) {
            // pd
            sum += mat[i][i];
            //sd
            if(i != n-1-i) {
                sum +=mat[i][n-i-1];
            }
        }
        System.out.println("Sum is : "+sum);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        diagonalSum(matrix);
    }

}
