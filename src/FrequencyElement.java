import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        int l = 0, res = 1;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while ((long) nums[r] * (r - l + 1) - sum > k) {
                sum -= nums[l];
                l++;
            }
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
public class FrequencyElement {
    public static void main(String[] args) {
        int [] nums = {1,2,6};
        int k = 3;
        Solution s = new Solution();
        System.out.println(s.maxFrequency(nums , k));
    }
}
