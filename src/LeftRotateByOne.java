//ROTATE THE ARRAY BY ONE

import java.net.SocketOption;
import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        int n = arr[0];
        for (int i=0 ; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] =n;
       for(int i : arr){
           System.out.print(" "+i);
       }
    }
}
