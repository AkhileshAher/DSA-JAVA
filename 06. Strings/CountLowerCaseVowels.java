
import java.util.Scanner;

public class CountLowerCaseVowels {

    public static int vowelsLowercase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count += 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = vowelsLowercase(str);
        System.out.println("COUNT : " + count);

    }
}
