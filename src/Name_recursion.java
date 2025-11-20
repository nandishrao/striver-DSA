class Name{
    String print_name(String n, int t){
        String name;
        if(t==0)
            return "";
        System.out.println(n);
        return print_name(n , t-1 ) ;
    }
}

public class Name_recursion {
    public static void main(String[] args) {
        Name A = new Name();
        A.print_name("Nandish" , 10);
    }
}
