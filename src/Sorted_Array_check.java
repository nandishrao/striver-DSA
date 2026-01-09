class SortedCheck{
public static boolean sortedcheckfn(int[] arr) {
    for (int i=0 ; i<arr.length-1 ; i++){
        if(arr[i] > arr[i+1]){
            return false;
        } ;
       }
    return true;
    }
}
public class Sorted_Array_check {
    public static void main(String[] args) {
        SortedCheck s = new SortedCheck();
        int [] arr = {1,2,3,4,5,8,9,10};
        boolean result = s.sortedcheckfn(arr);
        System.out.print(result);
    }
}
