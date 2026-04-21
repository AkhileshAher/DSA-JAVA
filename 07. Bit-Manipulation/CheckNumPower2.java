
public class CheckNumPower2 {

    public static boolean checkPowerof2(int n) {
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        boolean check = checkPowerof2(1);
        System.out.println(check);
    }
}
