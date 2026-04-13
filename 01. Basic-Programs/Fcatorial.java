import java.util.Scanner;

public class Fcatorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        double fact = 1;
        for (int i = 0; i < number; i++) {
            fact = fact * (number - i);
        }
        System.out.println("Factorial of Number is : " + fact);
        scn.close();
    }
}