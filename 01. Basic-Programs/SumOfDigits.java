public class SumOfDigits {

    public static int sumDig(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDig = n % 10;
            sum += lastDig;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDig(12345));
    }
}
