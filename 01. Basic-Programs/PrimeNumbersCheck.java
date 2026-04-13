import java.util.Scanner;

public class PrimeNumbersCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("N is Prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            String str = (isPrime) ? "Prime Number" : "Not a Prime Number";
            System.out.println(str);
        }
        sc.close();
    }
}