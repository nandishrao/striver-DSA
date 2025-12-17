import java.util.Arrays;

class left{
    public int[] leftRotate(int [] arr , int k){
        for (int m=0 ; m<=k ; m++){
            for (int i=0 ; i< arr.length-1 ; i++){
                arr[i] =arr[i+1];
            }
        }
        return arr;
    }
}
public class RotateByDplaces {
    public static void main(String[] args) {
    int [] arr={10,20,30,40,50,60};
    int k =3;
    left l = new left();
   System.out.print(" "+ Arrays.toString(l.leftRotate(arr, k)));
    }
}
