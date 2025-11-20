public class ArrayReverse {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,60};
        for(int i=0 ; i<a.length/2 ; i++){
            int temp = a[i];
            a[i] = a[a.length - i -1];
            a[a.length - i -1]=temp;
        }
        for (int n : a) {
            System.out.println(n);
        }
    }
}
