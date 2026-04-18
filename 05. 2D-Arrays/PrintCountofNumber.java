
public class PrintCountofNumber {

    public static void printFrequency(int mat[][], int target) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == target) {
                    count++;
                }
            }
        }
        System.out.println("Count : " + count);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        printFrequency(matrix,7);
    }   
}
