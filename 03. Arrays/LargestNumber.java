import java.util.*;

public class LargestNumber {

    public static int largest_number(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 3, 2, 5, 50, 12, 90, 20 };
        System.out.println(largest_number(numbers));
    }
}
