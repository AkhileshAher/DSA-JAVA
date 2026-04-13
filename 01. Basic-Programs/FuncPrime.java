import java.lang.Math;

public class FuncPrime {

    // only for n >=2
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        if (isPrime(37)) {
            System.out.println("PRIME");
        } else {

            System.out.println("NOT A PRIME");
        }
    }
}
