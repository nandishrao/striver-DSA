import java.util.Arrays;

class Solution_MoveZeros {
    public int[] MoveZeros(int[] arr) {
        int[] temp = new int[arr.length];
       int  index =0;
        for (int j : arr) {
            if (j != 0) {
                temp[index] = j;
                index++;
            }
        }
        for(int  i=0;i<arr.length ; i++){
            arr[i] = temp[i];
        }
        return arr;
    }
}

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 1, 2, 0, 4, 5, 0};
        Solution_MoveZeros s = new Solution_MoveZeros();
        int[] result = s.MoveZeros(arr);
        System.out.print(" " + Arrays.toString(result));
    }
}
