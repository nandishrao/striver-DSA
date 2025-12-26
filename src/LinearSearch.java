public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int key = 9;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.print(" element found at position " + i);
            }
        }
        System.out.print(" element not found");
    }
}
