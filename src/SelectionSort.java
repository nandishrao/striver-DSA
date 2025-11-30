
public class SelectionSort{
    static void selection(int [] arr){
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            int min_idx = i;
            for(int j=i+1 ; j<n ; j++){
                if(arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
    static void PrintArray(int[] arr){
        for ( int val : arr){
            System.out.print(val  +" ");
        }
        System.out.print("");
    }
    public static void main(String[] args) {
        int [] arr= {12,45,21,98,45,43,1,23,5,9};
        System.out.print("Array before Sort");
       // Sort s = new Sort();
        PrintArray(arr);
        System.out.println("Array after Sort");
        selection(arr);
        PrintArray(arr);
    }
}