
public class MatricesSmallestLargest {

    public static void largestSmallest(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest in Matrix is : " + largest);
        System.out.println("Smallest in Matrix is : " + smallest);
    }

    public static void main(String[] args) {
        int nums[][] = {{1,2,3},{4,5,6},{10,12,14}};
        largestSmallest(nums);
        
    }
}
