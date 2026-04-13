public class DecimalToBinary {
    public static int DecToBin(int num) {
        int decNum = 0;
        int power = 0;
        while (num > 0) {
            int bit = num % 2;
            decNum = decNum + bit * (int) (Math.pow(10, power));
            num /= 2;
            power++;
        }
        return decNum;
    }

    public static void main(String[] args) {
        System.out.println(DecToBin(8));
    }
}
