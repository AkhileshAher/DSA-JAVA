
public class SubArray {

    public static void brute_subarray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void optimised_subarray(int nums[]) {

    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10 };
        brute_subarray(nums);
        // optimised_subarray(nums);
    }

}
