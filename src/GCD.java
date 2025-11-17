public class GCD {
    public static void main(String[] args) {
        int a = 21;
        int b = 9;
        int result = Math.min( a, b);

        while(result > 0){
            if(a % result == 0 || b%result == 0){
                break;
            }
            result--;
        }
        System.out.println(result);
    }
}

