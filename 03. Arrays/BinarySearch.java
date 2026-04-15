public class BinarySearch {

    public static String binSearchString(int nums[], int key) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] == key) {
                return "FOUND";
            } else if (nums[mid] < nums[start]) {
                end--;
            } else {
                start++;
            }
        }

        return "NOT FOUND";
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12 };
        int key = 10;
        System.out.println(binSearchString(num, key));
    }

}
