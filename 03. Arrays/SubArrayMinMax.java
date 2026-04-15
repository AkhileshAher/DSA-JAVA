public class SubArrayMinMax {

    public static void brute_subarray(int nums[]) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k]);
                    sum += nums[k];
                    if (sum < smallest) {
                        smallest = sum;
                    }
                    if (sum > largest) {
                        largest = sum;
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("MAX SUBARRAY SUM : " + largest);
        System.out.println("MIN SUBARRAY SUM : " + smallest);

    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10 };
        brute_subarray(nums);
    }

}
