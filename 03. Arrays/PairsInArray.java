

public class PairsInArray {

    public static void brute_pairs(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + nums[i] + " " + nums[j] + ") , ");
            }
            System.out.println();
        }
    }

    public static void optimised_pairs(int nums[]) {
        int fp = 0;
        int lp = nums.length - 1;
        while (lp != 0) {
            System.out.print("(" + nums[fp] + "," + nums[lp] + ") , ");
            fp++;
            if (fp == lp) {
                fp = 0;
                lp--;
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10 };
        brute_pairs(nums);
        System.out.println("Optimised");
        optimised_pairs(nums);
    }

}
