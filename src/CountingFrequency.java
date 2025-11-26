import java.util.HashMap;

public class CountingFrequency {
    public static void main(String[] args) {
        int [] arr = {1,1,1,3,4,2,1,3,10,10,4,12,13,10};
        HashMap <Integer , Integer> h =new HashMap<Integer,Integer>();
        for (int i =0 ; i < arr.length ; i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i], h.get(arr[i]) + 1);

            }else{
                h.put(arr[i] , 1);
            }
        }
        System.out.println(h);
    }
}
