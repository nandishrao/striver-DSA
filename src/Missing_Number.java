import java.util.Arrays;

class SolutionMissingNumber {
    public int MissingNumberFn(int[] arr) {
        int n = arr.length;

        int expectedSum = (n + 1) * (n + 2) / 2; // for ARRAY starting from 1
        //int expectedSum = n * (n+1)/2 {for ARRAY starting from 0}

        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
//OTHER TECHNIQUE
//public int missingNumber(int[] numbs) {
//    int j=0;
//    Arrays.sort(numbs);
//    for(int i=0;i<numbs.length;i++){
//        if(numbs[i]!=j){
//            return j;
//        }
//        j++;
//    }
//    return numbs.length; }

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        SolutionMissingNumber s = new SolutionMissingNumber();
        int result = s.MissingNumberFn(arr);
        System.out.print(" " + result);
    }
}
