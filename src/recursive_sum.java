class Sum{
    int add(int n){
        int result=0;
        if(n==0)
            return 0;
        return n+add(n-1);
    }
}

public class recursive_sum {
    public static void main(String[] args) {
        Sum s=new Sum();
        System.out.println(s.add(10));

    }
}
