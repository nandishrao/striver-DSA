
import java.util.HashMap;

class Solution_subarraysum{
    public int subarraysum(int [] arr , int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // important base case

        int sum = 0;
        int count = 0;

        for (int num : arr) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
public class subarraysum {
    public static void main(String[] args) {
        int [] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        Solution_subarraysum s = new Solution_subarraysum();
       System.out.print(" "  + s.subarraysum(arr , k));
    }
}
