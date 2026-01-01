class Consecutive_ones{
    public int fnOnes(int[] arr){
        int n = arr.length;
        int count =0 ;
        int finalCount = 0;
        for(int i=0 ; i<n; i++){
            if(arr[i] == 1){
                count++;
                finalCount = Math.max(finalCount, count);
            }
            else{
                count =0 ;
            }
        }
        return  finalCount;
    }
}

public class consecutive_n {
    public static void main(String[] args) {
        int [] arr= {1,0,1,1,0,1};
        Consecutive_ones c = new Consecutive_ones();
        int result = c.fnOnes(arr);
        System.out.print(" " +result);
    }
}
