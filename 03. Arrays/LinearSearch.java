public class LinearSearch {

    public static int linearSearch(int numbers[], int key) {
        for (int e = 0; e < numbers.length; e++) {
            if (numbers[e] == key) {
                return e;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10, 12, 14, 16, 20 };
        int key = 10;
        int index = linearSearch(nums, key);
        System.out.println(index);
    }

}
