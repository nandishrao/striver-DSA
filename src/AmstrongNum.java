public class AmstrongNum {
    public static void main(String[] args) {
        int num = 1634;
        int original = num;
        int count =0;
        while ( num > 0 ) {
            num = num / 10;
            count++;
        }
        int realoriginal = original;
        System.out.println(realoriginal);
    int sum =0;
        while (original != 0){
            int digit = original % 10;
            sum = sum + (int)Math.pow(digit, count);
            original /= 10;
        }
        System.out.println(sum);
if(sum == realoriginal){
    System.out.println("yes it is a armstrong number");
}else{
    System.out.println("No it is not an armstrong number");
}
    }
}
