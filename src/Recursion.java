class Fact{
    int fact(int n){
        int result;
        if(n<=1)
            return 1;
        result = fact(n-1)*n;
        return result;
    }
        }


public class Recursion {
    public static void main(String[] args) {
        Fact f = new Fact();
        System.out.println("The factorial is "+f.fact(5));

    }
}
