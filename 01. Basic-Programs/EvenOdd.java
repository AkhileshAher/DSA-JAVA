import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = scn.nextInt();
        if ((n & 1) == 1) {
            System.out.println(n + "is an ODD Number");
        } else {
            System.out.println(n + " is an Even Number");
        }
        scn.close();
    }
}