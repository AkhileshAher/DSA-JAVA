
public class Swap2NumsWOThirdVar {
    

    public static void swap(int a, int b) {
        a = a ^ b;
        b = b ^ a;
        a= a ^ b;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }


    public static void main(String [] args) {
        swap(10,20);
    }
    
}
