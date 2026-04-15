
public class MaxSubArraySum {

    public static void brute_method(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                    // System.out.print(nums[k] + " ");
                    if (sum > largest) {
                        largest = sum;
                    }
                }
                // System.out.println();
            }
        }
        System.out.println("MAX SUB ARRAY SUM : " + largest);

    }

    public static void optimised(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currSum = 0;
            for (int j = i; j < nums.length; j++) {
                if (currSum < 0) {
                    currSum = 0;
                }
                currSum += nums[j];
            }
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        System.out.println("MAX SUM : " + maxSum);
    }

    public static void kadane(int nums[]) {
        int currSum = Integer.MIN_VALUE;
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int nums[] = { 1, -2, 6, -1, 3 };
        brute_method(nums);
        optimised(nums);
        kadane(nums);
    }
}
