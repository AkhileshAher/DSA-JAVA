
import java.util.Scanner;

public class StringMethods {

    public static void printLetters(String str) {
        for(int i=0;i<str.length();i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String [] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println(str.length());
        System.out.println(str);
        printLetters(str);

    }
}
