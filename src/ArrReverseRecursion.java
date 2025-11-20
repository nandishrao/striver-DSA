class Reverse{
    static void ArrReverse(int[] arr , int start ,int end){
        if(start>end) {
            return;
        }
        int temp  = arr[start];
        arr[start] = arr[end];
        arr[end]=temp;

        ArrReverse(arr , start+1 , end-1);

    }
}

public class ArrReverseRecursion {
    public static void main(String[] args) {
        int [] arr={10, 20, 30, 40,50,60};
    for(int n : arr){
        System.out.println(" "+n);
    }
        Reverse r = new Reverse();
        r.ArrReverse(arr ,0, arr.length-1 );

        for (int n : arr){
            System.out.println(" " +n);
        }
    }
}
