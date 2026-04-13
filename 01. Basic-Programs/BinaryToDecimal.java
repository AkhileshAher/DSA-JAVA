import java.util.Scanner;

public class BinaryToDecimal {

    public static int binToDec(int num) {
        int dec = 0;
        int pow = 0;
        while (num > 0) {
            int lastBit = num % 10;
            dec = dec + (lastBit * (int) (Math.pow(2, pow)));
            pow++;
            num = num / 10;
        }
        return dec;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();
        System.out.println(binToDec(binNum));
        sc.close();
    }

}
