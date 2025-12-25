import java.util.Arrays;

class RotateRightSolution {
    public void rightRotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n; // CHECK WHETHER IS SMALLER THAN ARRAY SIZE
        int[] temp = Arrays.copyOfRange(arr, n - k, n);
        for (int i = n - k - 1; i >=0; i--) {
            arr[i+k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
}

public class RotateRight {
    public static void main(String[] args) {
        RotateRightSolution sol = new RotateRightSolution();

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        sol.rightRotate(arr, k);
        System.out.println("Array after right rotation: " + Arrays.toString(arr));
    }
}
