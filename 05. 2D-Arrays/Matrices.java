import java.util.Scanner;

public class Matrices {

    public static boolean search(int matrix[][], int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void inputArray(int matrix[][]) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        scn.close();
    }

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        inputArray(matrix);
        printMatrix(matrix);
        boolean found = search(matrix,9);
        if(found) {
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }

        Scanner scn = new Scanner(System.in);
        scn.close();

    }

}
