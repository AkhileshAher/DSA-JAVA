import java.util.Scanner;

public class SumInput {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a+b);
        sc.close();
    }
}