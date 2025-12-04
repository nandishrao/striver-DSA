public class SecondLargest {
    public static void main(String[] args) {
        int largest = 0;
        int SecLargest = 0;
        int [] arr={1,4,2,3,7,9,10,0};
        for(int i=0 ; i< arr.length ; i++){
            if(arr[i] > largest){
                SecLargest = largest;
                largest= arr[i];
            }else if(arr[i]>SecLargest ){
                SecLargest = arr[i];
            }
        }
        System.out.print(""+SecLargest );
    }
}
