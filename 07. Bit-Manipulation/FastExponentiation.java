
public class FastExponentiation {

    public static int fastExponentiation(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans *= a;
            }
            a *= a;
            n = n >> 1;
        }
        System.out.println("Exponentiation : " + ans);
        return ans;
    }

    public static void main(String[] args) {
        fastExponentiation(3, 5);
    }
}
class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long num = n;

        if (num < 0) {
            x = 1 / x;
            num = -num;
        }

        while (num > 0) {
            if ((num & 1) != 0) {
                ans *= x;
            }
            x *= x;
            num = num >> 1;
        }

        return ans;
    }
}