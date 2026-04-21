
public class IthBit {

    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        // System.out.println(bitmask);
        return n & bitmask;
    }

    public static int clearLastIthBits(int n, int i) {
        int bitmask = ~(0) << i;
        return n & bitmask;
    }

    public static int clearRangeofBits(int n, int i, int j) {
        int a = (~(0) << (j + 1));
        int b = (int) Math.pow(2, i) - 1;
        return n & (a | b);
    }

    public static void main(String[] args) {
        // int ithBit = getIthBit(10, 3);
        // System.out.println(ithBit);
        // int setIthBit = setIthBit(10, 2);
        // System.out.println(setIthBit);
        // int clearLastIthBit = clearLastIthBits(15, 3);
        // System.out.println(clearLastIthBit);

        int bit = clearRangeofBits(31,1 , 3);
        System.out.println(bit);

    }
}
