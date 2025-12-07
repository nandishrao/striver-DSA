import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr ={1,1,2,2,3,4,5,5,6,7};
        Set<Integer> hashSet = new HashSet<>();
        for(int i : arr){
           hashSet.add(arr[i]);
        }
        System.out.print(hashSet);
    }
}
