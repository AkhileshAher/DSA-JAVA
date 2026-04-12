import java.util.*;

public class AreaCircleInput {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        float rad = sc.nextFloat();
        float area = 3.142f * rad * rad;
        System.out.print(area);
        sc.close();
    }
}
