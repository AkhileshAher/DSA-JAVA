public class LinearSearchString {

    public static int linear_search(String[] fruit, String key) {
        for (int i = 0; i < fruit.length; i++) {
            if (fruit[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String fruits[] = { "Apple", "Banana", "Papaya" };
        String key = "Banana";

        int index = linear_search(fruits, key);
        System.out.println(index);

    }

}
