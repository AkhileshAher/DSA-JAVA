
public class Printsumof2ndRow {

    public static void numbersSum(int matrix[][]) {
        int sum = 0;
        for(int j=0;j<matrix[0].length;j++) {
            sum +=  matrix[1][j];
        }
        System.out.println("Sum : "+sum);
    }
    public static void main(String [] args) {
        int nums [][] = {{1,4,9},{11,4,3},{2,2,3}};
        numbersSum(nums);
    }
}
