

public class ReverseArray {

    public static void reverse_array(int nums[]) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }

    }

    public static void main(String[] args) {

        int num[] = { 10, 20, 30, 40 ,50};

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        reverse_array(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

}
