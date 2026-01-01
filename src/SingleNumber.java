public class SingleNumber {
    public static void main(String[] args) {
        Solution_SingleNum sol = new Solution_SingleNum();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(sol.singleNumber(nums));
    }
}

class Solution_SingleNum {
    public int singleNumber(int[] arr) {
        int result = 0;

        for (int num : arr) {
                result = result ^ num;
        }

        return result;
    }
}
