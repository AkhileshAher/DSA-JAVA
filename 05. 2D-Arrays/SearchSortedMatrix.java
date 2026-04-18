
public class SearchSortedMatrix {

    public static void staircaseSearch(int mat[][], int target) {
        int n = mat.length;
        int m = mat[0].length;

        int row = 0;
        int col = m - 1;

        // Top Right Corner
        while (row <= n - 1 && col >= 0) {
            if (mat[row][col] == target) {
                System.out.println("FOUND at : (" + row + "," + col + ")");
                break;
            }
            if (mat[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        row = n - 1;
        col = 0;
        // Left Bottom Corner
        while (row >= 0 && col <= m - 1) {
            if (mat[row][col] == target) {
                System.out.println("FOUND at : (" + row + "," + col + ")");
                break;
            }

            if(mat[row][col] < target) {
                col++;
            } else {
                row--;
            }
        }

    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        staircaseSearch(matrix, 33);
    }

}
