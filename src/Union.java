import java.util.*;

class unionSolution {
    public List<Integer> findUnion(int[] arr1, int[] arr2) {
        Set<Integer> st = new TreeSet<>();
        for (int num : arr1) {
            st.add(num);
        }
        for (int num : arr2) {
            st.add(num);
        }
        return new ArrayList<>(st);
    }
}

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8,};
        int[] arr2 = {1, 9, 10, 13, 2, 12, 16, 17};
        unionSolution u = new unionSolution();
        List<Integer> result = u.findUnion(arr1, arr2);
        System.out.print(result);
    }
}
