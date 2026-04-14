
import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        for (int line = 1; line <= num; line++) {
            char c = 'A';
            for (int number = 1; number <= line; number++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
        scn.close();
    }

}